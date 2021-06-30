package com.veesing.common.service.impl;

import com.veesing.common.dao.FileDao;
import com.veesing.common.domain.FileDO;
import com.veesing.common.service.FileService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;


@Service
public class FileServiceImpl implements FileService {
	private FileDao sysFileMapper;

	public FileServiceImpl(FileDao sysFileMapper) {
		this.sysFileMapper = sysFileMapper;
	}

	@Override
	public FileDO get(Long id){
		return sysFileMapper.get(id);
	}

	@Override
	public List<FileDO> list(Map<String, Object> map){
		return sysFileMapper.list(map);
	}

	@Override
	public int count(Map<String, Object> map){
		return sysFileMapper.count(map);
	}

	@Override
	public int save(FileDO sysFile){
		return sysFileMapper.save(sysFile);
	}

	@Override
	public int update(FileDO sysFile){
		return sysFileMapper.update(sysFile);
	}

	@Override
	public int remove(Long id){
		return sysFileMapper.remove(id);
	}

	@Override
	public int batchRemove(Long[] ids){
		return sysFileMapper.batchRemove(ids);
	}

}
