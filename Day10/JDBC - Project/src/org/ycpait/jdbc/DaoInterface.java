package org.ycpait.jdbc;

import java.util.Collection;

interface DaoInterface<T, ID> {
	
	Collection<T> getAll();
}
