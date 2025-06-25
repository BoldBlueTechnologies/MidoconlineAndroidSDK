![](https://github.com/BoldBlueTechnologies/MidoconlineAndroidSDK/blob/main/midoconline_banner_sdk.png)

# MidoconlineAndroidSDK

Bienvenido al SDK de Midoconline. Este kit te permite integrar fácilmente un botón dentro de tu aplicación para conectar a tus usuarios con Médicos, Psicólogos y Nutriólogos en línea. Ver su agenda, chatear y descargar recetas, dietas u ordenes de estudio.
Con una sola implementación, puedes brindar acceso directo a consultas de salud confiables, sin salir de tu app. Ideal para apps que desean agregar servicios de salud con una integración rápida, segura y sin complicaciones.
Este repositorio contiene todo lo necesario para integrar el SDK en tu proyecto Android.

# 1. Instalación

Paso 1. Agrega el repositorio JitPack a tu archivo de compilación:

```
allprojects {
  repositories {
    maven { url 'https://jitpack.io' }
  }
}
```
Paso 2. Agrega la dependencia
```
dependencies {
      implementation 'com.github.BoldBlueTechnologies:MidoconlineAndroidSDK:${version}'
}
```
# 2. Uso

El SDK ofrece varios botónes personalizados que mostrarán la interfaz de midoconline. 

Integración por XML

Ejemplo 1 :
```
<com.app.boldblue.midoconlinesdk.ButtonWhiteMdoPac
android:layout_width="match_parent"
android:layout_height="wrap_content"/>
```
![](https://github.com/BoldBlueTechnologies/MidoconlineAndroidSDK/blob/main/midoconlinev1_sdk.png)

Ejemplo 2 :
```
<com.app.boldblue.midoconlinesdk.ButtonBlueMdoPac
android:layout_width="match_parent"
android:layout_height="wrap_content"/>
```
![](https://github.com/BoldBlueTechnologies/MidoconlineAndroidSDK/blob/main/midoconlinev2_sdk.png)

Ejemplo 3 :
```
<com.app.boldblue.midoconlinesdk.Button2WhiteMdoPac
android:layout_width="match_parent"
android:layout_height="wrap_content"/>
```
![](https://github.com/BoldBlueTechnologies/MidoconlineAndroidSDK/blob/main/midoconlinev3_sdk.png)

Ejemplo 4 :
```
<com.app.boldblue.midoconlinesdk.Button2BlueMdoPac
android:layout_width="match_parent"
android:layout_height="wrap_content"/>
```
![](https://github.com/BoldBlueTechnologies/MidoconlineAndroidSDK/blob/main/midoconlinev4_sdk.png)

Ejemplo 5 :
```
<com.app.boldblue.midoconlinesdk.Button3WhiteMdoPac
android:layout_width="match_parent"
android:layout_height="wrap_content"/>
```
![](https://github.com/BoldBlueTechnologies/MidoconlineAndroidSDK/blob/main/midoconlinev5_sdk.png)

Ejemplo 6 :
```
<com.app.boldblue.midoconlinesdk.Button3BlueMdoPac
android:layout_width="match_parent"
android:layout_height="wrap_content"/>
```
![](https://github.com/BoldBlueTechnologies/MidoconlineAndroidSDK/blob/main/midoconlinev6_sdk.png)


# 3. Requerimiento
   
Android: SDK 26 o superior.

# 4. Soporte
   
Si tienes dudas, sugerencias o problemas:

Abre un issue en este repositorio. O contacta al equipo de Bold Blue Technologies.
