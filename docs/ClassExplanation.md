# Documentación del paquete `net.salesianos`

Este paquete contiene clases relacionadas con la gestión de restaurantes.

## Clase `Restaurant`

La clase `Restaurant` representa un restaurante con su nombre, ubicación, horario y calificación.

| **Atributo** | **Descripción** |
|--------------|-----------------|
| `name` | Nombre del restaurante. |
| `location` | Ubicación del restaurante. |
| `hours` | Horario de operación del restaurante. |
| `rating` | Calificación del restaurante. |

### Constructor

- `Restaurant(String name, String location, String hours, float rating)`: Constructor para crear un nuevo restaurante con los atributos especificados.

### Métodos

| **Método** | **Descripción** |
|------------|-----------------|
| `getName(): String` | Devuelve el nombre del restaurante. |
| `setName(String name): void` | Establece el nombre del restaurante. |
| `getLocation(): String` | Devuelve la ubicación del restaurante. |
| `setLocation(String location): void` | Establece la ubicación del restaurante. |
| `getHours(): String` | Devuelve el horario de operación del restaurante. |
| `setHours(String hours): void` | Establece el horario de operación del restaurante. |
| `getRating(): float` | Devuelve la calificación del restaurante. |
| `setRating(float rating): void` | Establece la calificación del restaurante. |
| `toString(): String` | Devuelve una representación de cadena del restaurante, incluyendo todos sus atributos. |

## Clase `Menu`

La clase `Menu` proporciona métodos estáticos para interactuar con los restaurantes, como agregar, editar y eliminar.

| **Método** | **Descripción** |
|------------|-----------------|
| `addRestaurant(): void` | Permite al usuario agregar un nuevo restaurante. |
| `editRestaurant(): void` | Permite al usuario editar un restaurante existente. |
| `deleteRestaurant(): void` | Permite al usuario eliminar un restaurante existente. |
| `findRestaurantByName(String name, ArrayList<Restaurant> restaurants): Restaurant` | Busca un restaurante por nombre en una lista dada de restaurantes y devuelve el restaurante encontrado. |

## Clase `Manager`

La clase `Manager` gestiona una lista estática de restaurantes y proporciona métodos estáticos para operar sobre ella.

| **Método** | **Descripción** |
|------------|-----------------|
| `addRestaurant(Restaurant restaurant): void` | Agrega un restaurante a la lista. |
| `editRestaurant(int index, Restaurant restaurant): void` | Edita un restaurante en la lista. |
| `deleteRestaurant(int index): void` | Elimina un restaurante de la lista. |
| `showRestaurants(): void` | Muestra los restaurantes ordenados por clasificación en una ventana de diálogo. |
| `getRestaurants(): ArrayList<Restaurant>` | Devuelve la lista de restaurantes. |

## Clase `Window` y `Validation`

Estas clases contienen métodos utilitarios para interactuar con ventanas de diálogo y realizar validaciones, respectivamente. No están directamente relacionadas con la gestión de restaurantes.

