package org.jrtp.dcmodule.db.repo;

import org.jrtp.dcmodule.db.entity.Case;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author vaibhav
 *@date 15-Oct-2022
 * 
 */
public interface CaseRepo extends JpaRepository<Case, Long> {

}
