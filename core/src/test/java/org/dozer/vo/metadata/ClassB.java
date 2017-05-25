/*
 * Copyright 2005-2017 Dozer Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.dozer.vo.metadata;

/**
 * @author  florian.kunz
 */
public class ClassB {
    
    private String autoField;
    private String customFieldB;
    private ClassD classD;
    
    /**
     * stringField1 getter
     * @return the stringField1
     */
    public String getAutoField() {
        return autoField;
    }
    /**
     * stringField1 setter
     * @param stringField1 the stringField1 to set
     */
    public void setAutoField(String stringField1) {
        this.autoField = stringField1;
    }
    /**
     * stringFieldB getter
     * @return the stringFieldB
     */
    public String getCustomFieldB() {
        return customFieldB;
    }
    /**
     * stringFieldB setter
     * @param stringFieldB the stringFieldB to set
     */
    public void setCustomFieldB(String stringFieldB) {
        this.customFieldB = stringFieldB;
    }
    /**
     * classD setter
     * @param classD the classD to set
     */
    public void setClassD(ClassD classD) {
        this.classD = classD;
    }
    /**
     * classD getter
     * @return the classD
     */
    public ClassD getClassD() {
        return classD;
    }
    
}
