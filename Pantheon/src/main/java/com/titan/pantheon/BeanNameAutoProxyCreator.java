package com.titan.pantheon;

import org.springframework.util.PatternMatchUtils;

public class BeanNameAutoProxyCreator extends
	org.springframework.aop.framework.autoproxy.BeanNameAutoProxyCreator {

	private static final long serialVersionUID = 3453258579672015991L;

	protected boolean isMatch(String beanName, String mappedName) {

	boolean isMatch = false;

	if (mappedName.contains("-")) {
	    String splittedMappedName[] = mappedName.split("-");

	    if (PatternMatchUtils.simpleMatch(splittedMappedName[0], beanName)) {
		if (splittedMappedName[1].equalsIgnoreCase(beanName)) {
		    isMatch = false;
		} else {
		    isMatch = true;
		}
	    }
	    else {
		isMatch = false;
	    }
	}
	else {
	    isMatch = PatternMatchUtils.simpleMatch(mappedName, beanName);
	}
	return isMatch;
    }
}
