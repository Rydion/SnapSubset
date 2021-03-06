/* 
 *  
 * WalkInfo.java
 *  
 * written by Adrian Hintze
 *  
 * Copyright (c) 2015 by Adrian Hintze
 * 
 * This file is a part of Snapp!
 * 
 * Snapp! is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Affero General Public License as
 * published by the Free Software Foundation, either version 3 of
 * the License, or (at your option) any later version.
 * 
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU Affero General Public License for more details.
 * 
 * You should have received a copy of the GNU Affero General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 * 
 */

package dataStructures;

public class WalkInfo {
	
	
	/* private attributes */
	
	private Boolean valid;
	private String code;
	private String alternateCode;
	private GlobalInfo.nodeTypes nodeType;
	private ClassInfo classType;

	
	/* constructors */
	
	public WalkInfo() {
		
	}
	
	public WalkInfo(Boolean valid, String code, String alternateCode) {
		this.valid = valid;
		this.code = code;
		this.alternateCode = alternateCode;
	}
	
	public WalkInfo(Boolean valid, String code) {
		this.valid = valid;
		this.code = code;
	}
	
	
	/* set & get */
	
	public String getAlternateCode() {
		return alternateCode;
	}

	public void setAlternateCode(String alternateCode) {
		this.alternateCode = alternateCode;
	}
	
	public Boolean getValid() {
		return valid;
	}
	
	public void setValid(Boolean valid) {
		this.valid = valid;
	}
	
	public String getCode() {
		return code;
	}
	
	public void setCode(String code) {
		this.code = code;
	}

	public ClassInfo getClassType() {
		return classType;
	}

	public void setClassType(ClassInfo classType) {
		this.classType = classType;
	}

	public GlobalInfo.nodeTypes getNodeType() {
		return this.nodeType;
	}
	
	public void setNodeType(GlobalInfo.nodeTypes nodeType) {
		this.nodeType = nodeType;
	}
	
}
