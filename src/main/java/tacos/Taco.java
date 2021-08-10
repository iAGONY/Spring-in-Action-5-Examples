package tacos;

import java.util.Date;
import java.util.List;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import lombok.Getter;
import lombok.Setter;

//@Data
//@NoArgsConstructor
@Getter
@Setter
public class Taco {
	
	private Long id;
	
	private Date createdAt;

	@NotNull
	@Size(min = 5, message = "Name must be minimum 5 character length")
	private String name;
	@Size(min=1, message="You must choose at least 1 ingredient")
	private List<Ingredient> ingredients;
	
	

}
