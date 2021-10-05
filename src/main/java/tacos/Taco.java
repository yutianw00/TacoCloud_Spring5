// tag::all[]
// tag::allButValidation[]
package tacos;
import java.util.Date;
import java.util.List;
// end::allButValidation[]
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Table;
// tag::allButValidation[]
import lombok.Data;

@Data
@Table
public class Taco {
  
  @Id
  private Long id;
  //end::tableAndId[]

  private Date createdAt = new Date();

  // end::allButValidation[]
  @NotNull
  @Size(min=5, message="Name must be at least 5 characters long")
  // tag::allButValidation[]
  private String name;
  // end::allButValidation[]
  
//  @Size(min=1, message="You must choose at least 1 ingredient")
//  private List<IngredientRef> ingredients = new ArrayList<>();
//  
//  public void addIngredient(Ingredient taco) {
//    this.ingredients.add(new IngredientRef(taco.getId()));
//  }
  
  @NotNull(message="You must choose at least 1 ingredient")
  //@Size(min=1, message="You must choose at least 1 ingredient")
  // tag::allButValidation[]
  private List<String> ingredients;

}
//end::allButValidation[]
//tag::end[]
