# language: es
# autor: Jonathan Chacin

@VisualizacioProductosYServicios
Característica: Verificar que la pagina de sostenibilidad se muestre en el portal de Banitsmo
  Yo como cliente
  Quiero verificar la pagina de sostenibilidad se muestre manera correcta en el portal de Banistmo
  Para Para obtener informacion detallada de la convocotaria

  @DescargarPDFProhibicionesDePrestamoAuto
  Escenario: Varificar la informacion de la pagina de sostenibilidad
    Dado que ingreso a la pagina de Banistmo
    Cuando ingreso a la seccion de acerca de nosotros
    Entonces verifico que se muestre correctamente la pagina de sostenibilidad con el titulo Sostenibilidad
