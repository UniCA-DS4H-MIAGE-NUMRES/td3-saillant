package fr.unica.snicolas.pizzapp.composables

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.material.Card
import androidx.compose.material.ExperimentalMaterialApi
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.unit.dp
import fr.unica.snicolas.pizzapp.model.Pizza
import org.jetbrains.compose.resources.InternalResourceApi
import fr.unica.snicolas.pizzapp.utils.loadImage

@OptIn(ExperimentalMaterialApi::class, InternalResourceApi::class)
@Composable
fun PizzaCard(pizza: Pizza, onClick: () -> Unit) {
    Card(
        modifier = Modifier
            .fillMaxWidth()
            .padding(8.dp),
        onClick = onClick
    ) {
        Column {
            Image(
                painter = loadImage("pizza${pizza.id}.png"),
                contentDescription = pizza.name,
                modifier = Modifier
                    .fillMaxWidth()
                    .height(150.dp),
                contentScale = ContentScale.Crop
            )
            Column(modifier = Modifier.padding(16.dp)) {
                Text(text = pizza.name, style = MaterialTheme.typography.h6)
                Spacer(modifier = Modifier.height(8.dp))
                Text(text = "${pizza.price} €", style = MaterialTheme.typography.body1)
            }
        }
    }
}

