package fr.unica.snicolas.pizzapp.viewmodel

import fr.unica.snicolas.pizzapp.model.Pizza
import org.jetbrains.compose.resources.InternalResourceApi

class PizzaViewModel{
    val pizzas = listOf(
        Pizza(1,
            "Margherita",
            "drawable/pizza1.png",
            8.50,
            listOf("Tomato", "Cheese")
        ),
        Pizza(2,
            "Pepperoni",
            "drawable/pizza2.png",
            10.00,
            listOf("Pepperoni", "Cheese")
        ),
        Pizza(3,
            "Hawaiian",
            "drawable/pizza3.png",
            9.00,
            listOf("Ham", "Pineapple", "Cheese")
        ),
        Pizza(4,
            "BBQ Chicken",
            "drawable/pizza4.png",
            11.00,
            listOf("Chicken", "BBQ Sauce", "Cheese")
        ),
        Pizza(5,
            "Veggie",
            "drawable/pizza5.png",
            8.00,
            listOf("Bell Peppers", "Onions", "Mushrooms", "Cheese")
        ),
        Pizza(6,
            "Four Cheese",
            "drawable/pizza6.png",
            9.50,
            listOf("Mozzarella", "Cheddar", "Parmesan", "Gorgonzola")
        ),
        Pizza(7,
            "Meat Lovers",
            "drawable/pizza7.png",
            12.00,
            listOf("Pepperoni", "Sausage", "Bacon", "Ham", "Cheese")
        ),
        Pizza(8,
            "Buffalo Chicken",
            "drawable/pizza8.png",
            11.50,
            listOf("Chicken", "Buffalo Sauce", "Cheese")
        ),
        Pizza(9,
            "Mushroom",
            "drawable/pizza9.png",
            8.75,
            listOf("Mushrooms", "Garlic", "Cheese")
        )
    )
}
