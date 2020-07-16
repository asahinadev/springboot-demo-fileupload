package jp.mirageworld.spring.fileupload.controller;

import java.util.*;

import org.mybatis.spring.annotation.*;
import org.springframework.beans.factory.annotation.*;
import org.springframework.http.*;
import org.springframework.stereotype.*;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.*;

import jp.mirageworld.spring.fileupload.entity.*;
import jp.mirageworld.spring.fileupload.mapper.*;

import lombok.*;
import lombok.extern.slf4j.*;

@Slf4j
@Controller
@RequestMapping("/")
@MapperScan("jp.mirageworld.spring.fileupload.mapper")
public class IndexController {

	@Autowired
	FilesMapper mapper;

	@ModelAttribute("files")
	public List<FilesWithBLOBs> getFiles() {
		FilesExample example = new FilesExample();
		return mapper.selectByExampleWithBLOBs(example);
	}

	@GetMapping
	public String index() {
		log.info("GET");
		return "index";
	}

	@PostMapping
	@SneakyThrows
	public String post(@RequestPart("file") MultipartFile file) {
		log.info("POST");
		FilesWithBLOBs files = new FilesWithBLOBs();
		files.setFile(file.getBytes());
		mapper.insertSelective(files);
		return "redirect:/";
	}

	@ResponseBody
	@GetMapping(path = "image/{id}", produces = MediaType.IMAGE_PNG_VALUE)
	public byte[] file(@PathVariable("id") Integer id) {
		FilesKey key = new FilesKey();
		key.setId(id);
		return mapper.selectByPrimaryKey(key).getFile();
	}
}
