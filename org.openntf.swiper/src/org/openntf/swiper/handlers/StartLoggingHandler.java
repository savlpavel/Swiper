/*******************************************************************************
 * Copyright 2017 Cameron Gregor (http://camerongregor.com) 
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License
 *******************************************************************************/
package org.openntf.swiper.handlers;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.openntf.swiper.util.SwiperUtil;

public class StartLoggingHandler extends AbstractHandler {

	@Override
	public Object execute(ExecutionEvent arg0) throws ExecutionException {
	
		SwiperUtil.startLoggingToFile();		
		return null;
		
	}

	@Override
	public boolean isEnabled() {
		return !SwiperUtil.isLoggingToFile();
	}

	@Override
	public void setEnabled(Object evaluationContext) {

	}

	
	
}
