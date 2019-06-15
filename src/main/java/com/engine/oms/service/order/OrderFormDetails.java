package com.engine.oms.service.order;

import com.engine.oms.model.Dish;
import java.util.List;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotEmpty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Create Order Form Bean.
 * 
 * @author osamam
 */

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class OrderFormDetails {

	@NotEmpty(message = "*Please provide your name")
	private String name;
	
	@NotEmpty(message = "*Please provide your address")
	private String address;
	
	private List<Dish> dishes;
	
	@Min(value = 1, message = "Quantity should be greater than 0")
	private int quantity;
	
	@NotEmpty(message = "*Please provide your phone number")
	private String phoneNumber;
}
