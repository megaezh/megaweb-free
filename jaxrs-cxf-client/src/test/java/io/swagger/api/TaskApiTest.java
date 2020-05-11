/**
 * Киноконтент API
 * REST API биржи описаний к фильмам и сериалам https://kinocontent.club
 *
 * OpenAPI spec version: 1.0.0
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package io.swagger.api;

import io.swagger.model.Error;
import io.swagger.model.InlineResponse200;
import org.junit.Test;
import org.junit.Before;
import static org.junit.Assert.*;

import javax.ws.rs.core.Response;
import org.apache.cxf.jaxrs.client.JAXRSClientFactory;
import org.apache.cxf.jaxrs.client.ClientConfiguration;
import org.apache.cxf.jaxrs.client.WebClient;


import com.fasterxml.jackson.jaxrs.json.JacksonJsonProvider;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;




/**
 * Киноконтент API
 *
 * <p>REST API биржи описаний к фильмам и сериалам https://kinocontent.club
 *
 * API tests for TaskApi 
 */
public class TaskApiTest {


    private TaskApi api;
    
    @Before
    public void setup() {
        JacksonJsonProvider provider = new JacksonJsonProvider();
        List providers = new ArrayList();
        providers.add(provider);
        
        api = JAXRSClientFactory.create("https://kinocontent.club/api/v1", TaskApi.class, providers);
        org.apache.cxf.jaxrs.client.Client client = WebClient.client(api);
        
        ClientConfiguration config = WebClient.getConfig(client); 
    }

    /**
     * Удаление задания
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void taskDeleteTest() {
        Integer id = null;
        //Boolean response = api.taskDelete(id);
        //assertNotNull(response);
        // TODO: test validations
        
        
    }
    /**
     * Получение информации о задании
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void taskGetTest() {
        Integer id = null;
        //InlineResponse200 response = api.taskGet(id);
        //assertNotNull(response);
        // TODO: test validations
        
        
    }
    /**
     * Добавление задания
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void taskPostTest() {
        Integer kinopoiskId = null;
        //Object response = api.taskPost(kinopoiskId);
        //assertNotNull(response);
        // TODO: test validations
        
        
    }
    /**
     * Редактирование задания
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void taskPutTest() {
        Integer id = null;
        Integer symbolsFrom = null;
        Integer symbolsTo = null;
        String comment = null;
        String privateComment = null;
        Boolean confirmed = null;
        Boolean express = null;
        Boolean archived = null;
        Boolean rework = null;
        String reworkComment = null;
        //Object response = api.taskPut(id, symbolsFrom, symbolsTo, comment, privateComment, confirmed, express, archived, rework, reworkComment);
        //assertNotNull(response);
        // TODO: test validations
        
        
    }
    /**
     * Получение списка заданий
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void tasksGetTest() {
        Boolean includeData = null;
        Boolean done = null;
        Boolean confirmed = null;
        Boolean archived = null;
        Integer limit = null;
        Integer page = null;
        //Object response = api.tasksGet(includeData, done, confirmed, archived, limit, page);
        //assertNotNull(response);
        // TODO: test validations
        
        
    }
}
