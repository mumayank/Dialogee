![alt text](https://github.com/mumayank/Dialogee/blob/master/images%20for%20github/ic_launcher.png)

# Dialogee
Creating android dialogs was never this easy!

## Usage
```java
new Dialogee.Builder(activity, "title") // Must pass activity reference and the title of the dialog. Everything else is optional.

                .setDescription("description")
                
                .setCancellable(false) // Default is true
                
                .setPositiveButton("Positive Button Caption", new Dialogee.PositiveButton() {
                    @Override
                    public void action() {
                        // Do something
                    }
                })
                .setNegativeButton("Negative Button Caption", new Dialogee.NegativeButton() {
                    @Override
                    public void action() {
                        // Do something
                    }
                })
                .setNeutralButton("Neutral Button Caption", new Dialogee.NeutralButton() {
                    @Override
                    public void action() {
                        // Do something
                    }
                })
                .setIcon(R.mipmap.ic_launcher) // or any other resource int value like R.drawable.ic_action
                .build() // .build() returns a new Dialogee instance. You can call .show() on it later as well.
                .show();
```

## Screenshot
![alt text](https://github.com/mumayank/Dialogee/blob/master/images%20for%20github/Screenshot_1506834244.png)

## Download
The lib is hosted on jcenter (the default for android), hence just include the following line in your `app` level `gradle.build` under `dependencies`:
```gradle
compile 'com.mumayank:dialogee:2.0'
```
