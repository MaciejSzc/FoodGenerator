package pl.maciej.MenuCreator.models;

import java.util.Objects;

public class RecipeEntity {
    private String name;
    private String ingredients;
    private String tools;
    private String instruction;

    public RecipeEntity(String name, String ingredients, String tools, String instruction) {
        this.name = name;
        this.ingredients = ingredients;
        this.tools = tools;
        this.instruction = instruction;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getIngredients() {
        return ingredients;
    }

    public void setIngredients(String ingredients) {
        this.ingredients = ingredients;
    }

    public String getTools() {
        return tools;
    }

    public void setTools(String tools) {
        this.tools = tools;
    }

    public String getInstruction() {
        return instruction;
    }

    public void setInstruction(String instruction) {
        this.instruction = instruction;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        RecipeEntity that = (RecipeEntity) o;
        return Objects.equals(name, that.name) &&
                Objects.equals(ingredients, that.ingredients) &&
                Objects.equals(tools, that.tools) &&
                Objects.equals(instruction, that.instruction);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, ingredients, tools, instruction);
    }
}
