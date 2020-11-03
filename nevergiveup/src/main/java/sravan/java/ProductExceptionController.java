package sravan.java;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class ProductExceptionController {
   @ExceptionHandler(value = EvadikiTelusuRa.class)
   public ResponseEntity<Object> sravan(EvadikiTelusuRa exception) {
      return new ResponseEntity<>("Product not at all found", HttpStatus.INTERNAL_SERVER_ERROR);
   }
}