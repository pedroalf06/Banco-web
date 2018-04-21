package co.edu.usbcali.demo.modelo;

import static org.junit.jupiter.api.Assertions.*;

/*import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.log;*/

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;

@ExtendWith(SpringExtension.class)
@ContextConfiguration("/appContext.xml")
class TestInyecion {
		
  private final static Logger log=LoggerFactory.getLogger(TestInyecion.class);	
		
  @Autowired
  private Vehiculo vehiculo;
		
  @Test
  void test() {
  assertNotNull(vehiculo, "El vehiculo es Nulo");
  log.info("Marca:"+vehiculo.getMarca());	
  log.info("Color:"+vehiculo.getColor());
  log.info("Cilindraje:"+vehiculo.getMotor().getCilindraje());	
		
	}

}
/*
private EntityManagerFactory entityManagerFactory;
*/