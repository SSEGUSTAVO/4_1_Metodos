# 4_1_Ejercicio_1

Se pide realizar el siguiente ejercicio: Es el cumpleaños de Alex. Ha reunido a un grupo de ocho amigos para celebrarlo en un restaurante local. Cuando llega la factura, nadie sabe exactamente lo que debe. Solo se conoce el total antes de impuestos (16%) y la propina (10%). Se pide un programa para calcular el total de todos.
Esto es lo que debe cada uno antes de impuestos (16%) y la propina (10%):

Persona 1: 10 $  Persona 5: 7 $ 

Persona 2: 12 $  Persona 6: 15 $

Persona 3: 9 $  Persona 7: 11 $ 

Persona 4: 8 $  Persona 8: 30 $

Para resolver el problema, se diseñó el programa -coperacha-, al correrlo se detectó un problema de sintaxis ya que se espera el parentésis de cierre ")".

![Leccion 4_1_1_1](https://user-images.githubusercontent.com/54320247/64640998-d7482a80-d3d0-11e9-9353-845d83bffa27.jpg)

Se corrigió al colocar el paréntesis en donde lo indica el error. Sin embargo al correrlo de nuevo se observó que el resultado no era correcto ya que sólo mostraba la suma entre la propina y los impuestos.

![Leccion 4_1_1_2](https://user-images.githubusercontent.com/54320247/64641001-dadbb180-d3d0-11e9-8196-5e20d5857175.jpg)

Esto se corrigió al agregar en la suma el valor inicial para cada persona.

![Leccion 4_1_1_3](https://user-images.githubusercontent.com/54320247/64641004-dca57500-d3d0-11e9-9614-1106ca5b74b8.jpg)

# 4_1_Ejercicio_2

En este segundo ejercicio se pide realizar lo mismo del ejercicio 1 pero esta vez instanciando un método para facilitar el código.
Se diseña el método -vaquita- en la clase -trucha-, sin embargo cuando se intenta correr el programa aparece un error que indica que no se ha encontrado el método principal. Esto es ya que no se ha agregado el método principal main.

![Leccion 4_1_2_1](https://user-images.githubusercontent.com/54320247/64642158-52124500-d3d3-11e9-9160-c96861c21e61.jpg)

Se diseña el método principal en una nueva clase llamada -coperacha- e instanciando el método anterior, dando como resultado el mismo que en el ejercicio anterior.

![Leccion 4_1_2_2](https://user-images.githubusercontent.com/54320247/64642165-54749f00-d3d3-11e9-914d-3fcc0b5c8041.jpg)

# 4_1_Ejercicio_3

En este ejercicio se pide agregar un nombre y el aporte individual con impuestos y propina. Se diseña la clase -vaquita- que sirve como método de operación y la clase -coperacha- que se rediseño para obtener el resultado esperado.

![Leccion 4_1_3](https://user-images.githubusercontent.com/54320247/64642622-660a7680-d3d4-11e9-9d0f-d6b87aeecec4.jpg)

# 4_1_Ejercicio_4

En este ejercicio se pide realizar todos los pasos anteriores, esto es, agregar un nombre a cada persona, obtener el aporte individual de cada persona con impuestos y propina y obtener un total de todo lo obtenido sin impuestos y propina.
Se rediseñan las clases -coperacha- y -vaquita- y además se diseña la clase -sumame- que ocupa un método de retorno para poder utilizar el valor obtenido en otra clase. Al correr el programa se observa que no se imprime el costo total, ya que en la clase principal -coperacha- no se agregó una sentencia de impresión.

![Leccion 4_1_5_1](https://user-images.githubusercontent.com/54320247/64642172-56d6f900-d3d3-11e9-8071-cb483ff1a616.jpg)

Se agregó la sentencia de impresión pero al correr el programa se observa un error en el resultado.

![Leccion 4_1_5_2](https://user-images.githubusercontent.com/54320247/64642174-58082600-d3d3-11e9-8406-d934ca44562b.jpg)

Después de analizarlo detenidamente, se determina que en la clase -sumame- no se asignó una variable que contenga el valor, por lo que se corrige agregando la variable e instanciandolo en la clase principal.

![Leccion 4_1_5_3](https://user-images.githubusercontent.com/54320247/64642176-59d1e980-d3d3-11e9-9bea-4a029452a495.jpg)
