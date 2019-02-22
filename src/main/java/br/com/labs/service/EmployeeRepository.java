package br.com.labs.services;

import java.time.LocalDateTime;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.convert.ConversionService;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.Repository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.GetMapping;

@Configuration
@RepositoryRestResource(collectionResourceRel = "Employee", path = "Employee")
public interface EmployeeRepository extends PagingAndSortingRepository<Employee, Long> {

    @Autowired
    ConversionService conversionService;
/*
    @Modifying
    @Query("UPDATE Employee" +
    " SET cdStatus = 2" +
    " WHERE " +
    " dtEmployee = TO_DATE(?1, 'DD/MM/YYYY HH24:MI:SS') " +
    " AND idClient = ?2 " +
    " AND cdProduct = ?3 " +
    " AND cdSector = ?4 ")
    Integer qtEmployeeByClient(@Param("dtEmployee") LocalDateTime dtEmployee, @Param("idClient") Long idClient, @Param("cdProduct") Long cdProduct, @Param("cdSector") Long cdSector);
*/
    @Query(value=" SELECT " +
	"  E.qtEmployee " +
	"   FROM " +
	"  Employee E " +
	"  WHERE " +
	"  E.idSector = ?1 " +
	"  AND E.idProduct = ?2 " +
	"  AND E.StatusEmployee = 0 ", nativeQuery = true)
    Long searchQtEmployeeBySector(@Param("idSector") Long cdSector, @Param("idProduct") Long cdProduct);
/*
    @GetMapping("/Products")
    @Query(value="SELECT idCliente FROM Employee " +
    " WHERE " +
    "  idCliente = 3448493 " +
    " AND id.cdProduct = 91207 " +
    " AND id.cdSector = 79 ")
	List<Long> Products();
*/
}
