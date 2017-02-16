# Connection Detector

Detect the Internet Connection and WiFi/Hotspot enable disabled state. Handle wifi state.

#### Current Version
Latest release is in alpha testing stage. Version code : _**0.0.1**_

## Gradle
Just add the <dependency link comming soon> in your build.gradle of your module.
```java
dependencies {
...
compile 'comming soon'
...
}
```
## Usage
 
#### Detecting Internet Connectivity

**Create an object of class DetectInternet by passing the context of current activity in parameter.**

```java
DetectInternet detector = new DetectInternet(Acivity.this);
```

> NOTE : For Fragment use ```getActivity().getApplicationContext()``` in parameter.


**Calling detector method.**

```java
detector.isConnected(view, message);
```

> NOTE : ```view``` is View of current component responsible for triggering this method call. Incase of button's onClickListener, pass the view mentioned in onClick function's parameter. Getting the layout view,get the view by calling ```getWindow().getDecorView()```. In fragments, use ```getActivity().getWindow().getDecorView()```.
##
##
#### Detecting WiFi Connectivity

**Create an object of class DetectWifi by passing the context of current activity in parameter.**

```java
DetectWifi detector = new DetectWifi(Acivity.this);
```

> NOTE : For Fragment use ```getActivity().getApplicationContext()``` in parameter.


**Calling detector method.**

```java
detector.isConnected(view, message, action);
```

> NOTE : ```action``` is boolean value, set **true** to set action to TURN ON wifi from the snackbar.
##
##
#### Detecting Hotspot Connectivity

**Create an object of class DetectHotspot by passing the context of current activity in parameter.**

```java
DetectHotspot detector = new DetectHotspot(Acivity.this);
```

> NOTE : For Fragment use ```getActivity().getApplicationContext()``` in parameter.


**Calling detector method.**

```java
detector.isConnected(view, message);
```


