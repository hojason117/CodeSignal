String[][] groupingDishes(String[][] dishes) {
    HashMap<String, ArrayList<String>> ingredients = new HashMap<String, ArrayList<String>>();
    
    for(String[] dish : dishes) {
        for(int i = 1; i < dish.length; i++) {
            if(!ingredients.containsKey(dish[i]))
                ingredients.put(dish[i], new ArrayList<String>());
                
            ingredients.get(dish[i]).add(dish[0]);
        }
    }
    
    HashMap<String, ArrayList<String>> filteredIngredients = (HashMap<String, ArrayList<String>>)ingredients.clone();
    Iterator<String> iter = ingredients.keySet().iterator();
    while(iter.hasNext()) {
        String name = iter.next();
        if(ingredients.get(name).size() > 1)
            Collections.sort(filteredIngredients.get(name));
        else
            filteredIngredients.remove(name);
    }
    
    String[] ingredientNames = filteredIngredients.keySet().toArray(new String[filteredIngredients.keySet().size()]);
    Arrays.sort(ingredientNames);
    String[][] result = new String[ingredientNames.length][];
    for(int i = 0; i < ingredientNames.length; i++) {
        filteredIngredients.get(ingredientNames[i]).add(0, ingredientNames[i]);
        result[i] = filteredIngredients.get(ingredientNames[i]).toArray(new String[filteredIngredients.get(ingredientNames[i]).size()]);
    }
    
    return result;
}
