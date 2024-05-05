# PRUEBA TÉCNICA ASO
El objetivo principal es gestionar simulaciones de contrataciones de tarjetas de crédito para un cliente a través de un servicio que acepta peticiones POST con datos en formato JSON.

#### Request del servicio ASO.

PathParam: http://localhost:7500/TechArchitecture/helloWorld/v0/simulations/{nuip}

### VALIDACIONES

![](./img/POST-OK.png)

- Se introduce un offertype en minúsculas:
![](./img/bad-offertype.png)

- No se introduce un **amount**

![](./img/amount-null.png)

- Se introduce un **currency** vacía
![](./img/currency-empty.png)

- Se introduce un **id** de producto diferente a **"TDC"**
![](./img/id-tdc.png)

- Se introduce un **id** de subproducto con un tamaño diferente a 2 caracteres
![](./img/id-subproduct.png)