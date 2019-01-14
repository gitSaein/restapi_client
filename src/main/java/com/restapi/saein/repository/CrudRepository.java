package com.restapi.saein.repository;

import java.io.Serializable;

public interface CrudRepository<T, ID extends Serializable> {

	<S extends T>S save(S entity);
}
