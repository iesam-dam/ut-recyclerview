# Listados dinámicos con RecyclerView

## Qué se muestra

1. Cómo usar un componente RecyclerView.
2. Cómo usar DiffUtil para hacer un RecyclerView más eficiente.
3. Cómo añadir eventos (onclick) a un RecyclerView.

## Problema a resolver

En muchas aplicaciones nos encontramos que tenemos que mostrar un listado de registros obtenidos
de una API o de una Bases de Datos local. El número de registros es dinámico, unas veces puede tener
cinco registros otras cien, otras cincuenta, etc.

Un planteamiento erróneo sería el crearse la vista de forma dinámica teniendo un ScrollView como
contenedor padre ya que esto haría que la vista al completo estuviera en memoria. Si tiene cinco
registros no habría ningún problema pero si tiene cien quizás la aplicación se bloquearía.

## Solución

La solución para estos casos es usar un RecyclerView ya que gestiona la memoria de una forma
eficiente. Carga en memoria sólo los items que visualiza el usuario en la pantalla (quizás algunos
más). Cuando el usuario va haciendo scroll, aprovecha las vistas ya cargadas y sólo cambia la
información
del modelo que se desea pintar.

Hay que tener cuidado cuando se altera la vista (un item) según la condición de un modelo. Por
ejemplo, si cambias de color negro a rojo el título cuando un valor es mayor a 10, tendrás que meter
otra condición para restaurar el color inicial ya que cuando se recicla esa vista (item) mostrará el
título rojo. 

## Recursos
- [Vídeo Inicial RecyclerView](https://youtu.be/_voSD2balt4)
- [Vídeo RecyclerView optimizado](https://youtu.be/HuODh-H3Ao4)


