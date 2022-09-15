package guru.springframework.commands;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@NoArgsConstructor
public class NoteCommand {
    private Long id;
    private RecipeCommand recipe;
    private String recipeNotess;

}
