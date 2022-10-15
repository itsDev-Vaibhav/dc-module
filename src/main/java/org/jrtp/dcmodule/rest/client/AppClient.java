package org.jrtp.dcmodule.rest.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

/**
 * @author vaibhav
 *@date 15-Oct-2022
 * 
 */

@FeignClient(name = "AR-MODULE")
public interface AppClient {

	@GetMapping("localhost:9091/getapplication/{id}")
	ResponseEntity<?> getApp(@PathVariable Long id);
}
