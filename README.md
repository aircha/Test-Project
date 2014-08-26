Test-Project
============

[![Build Status](https://travis-ci.org/aircha/Test-Project.svg?branch=aircha)](https://travis-ci.org/aircha/Test-Project)

## github Test

**보금자리 만들지 말지**
결정하고자 여러 테스트 목적으로 생성한 프로젝트입니다.

```java
package com.meta.permission.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.meta.comm.beans.UserGroup;
import com.meta.comm.beans.UserSession;
import com.meta.permission.dao.PermissionDao;

@Service
public class PermissionServiceImpl implements PermissionService {

	private PermissionDao permissionDao;
	
	public List<UserGroup> getOwnerGroups(String targetCode, int action) {
	
		return permissionDao.getOwnerGroups( targetCode, action);
	}

	public boolean hasPermission(String targetCode, int action,
			UserSession userSession) {
		return permissionDao.hasPermission(targetCode, action, userSession);
	}

}
```

주소: http://aircha.github.io/blog