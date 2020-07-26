/**
 * Copyright © 2011 by
 * AVS GmbH (www.avs.de)
 * EVES Information Technology AG (www.eves-it.de)
 * ® All rights reserved.
 */
package com.mkyong.dao;

import java.util.List;



/**
 * AVS_MAPPIS<br>
 * de.avs.mappis.integration.persistence.partnerfirma PartnerfirmaDAO.java <br>
 * DAO-Interface zum PartnerfirmaDAOImpl
 * 
 * @author Ludwig Leuschner, AVS GmbH<br>
 *         Modifikations: Iva Abadjieva, AVS GmbH, April 2012
 * @version 1.0<br>
 */

public interface PartnerfirmaDAO{

	
	void setzenStatusStop(Status status) throws Exception;
	public List<StatusEnum> getAllesAusStatusEnum() throws Exception;
	public UserEntity getUserByName(String username);

}