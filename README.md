toaster
=======

Android Toaster! You can use toast anywhere.

## Usage

Initialize Toaster in the application class.

```java
public class MyApplication extends android.app.Application {
    @Override
    public void onCreate() {
        super.onCreate();
        Toaster.plugInOutlet(this);
    }
}
```

Define `android:name` in AndroidManifest.xml

```xml
<application
        android:name=".MyApplication"
        ...
```

You can use anywhere.

```java
Toaster.pon("Hello Toaster!");
```

ex.

```java
public class MainActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        findViewById(R.id.button).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toaster.pon("Hello Toaster!");
            }
        });
    }
}
```

## License

```
Copyright 2014 Toshihiro Yagi

Licensed under the Apache License, Version 2.0 (the "License");
you may not use this file except in compliance with the License.
You may obtain a copy of the License at

	http://www.apache.org/licenses/LICENSE-2.0

Unless required by applicable law or agreed to in writing, software
distributed under the License is distributed on an "AS IS" BASIS,
WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
See the License for the specific language governing permissions and
limitations under the License.
```
