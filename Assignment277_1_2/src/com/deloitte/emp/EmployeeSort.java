package com.deloitte.emp;

import java.util.Comparator;

public class EmployeeSort implements Comparator<EmployeeVo> {

		public EmployeeSort() {

		}

		@Override
		public int compare(EmployeeVo e1, EmployeeVo e2) {

			return (int) (e1.getIncometax() - e2.getIncometax());
		}

		
	}

