![alt text](https://github.com/mumayank/Dialogee/blob/master/images%20for%20github/ic_launcher.png)

# Dialogee
Creating android dialogs was never this easy!

## Usage
```java
new Dialogee.Builder(activity, "This is a dialog") // The activity instance and the title are compulsary to pass

                .setDescription("This is a long description for the dailog. Here you can put more information which is low-level in nature. This would help you in passing more information from the dialog UI to the end user.")
                
                .setCancellable(false) // Default is true
                
                .setPositiveButtonText("OK")
                .setPositiveButtonAction(new Dialogee.PositiveButton() {
                    @Override
                    public void action() {
                       // PLEASE NOTE
                       // If you have setPositiveButtonText() implemented, then you MUST implement this method as well.
                       // Better implementation is on its way in next version of the lib.
                    }
                })
                
                .setNegativeButtonText("Cancel")
                .setNegativeButtonAction(new Dialogee.NegativeButton() {
                    @Override
                    public void action() {
                        // PLEASE NOTE
                        // If you have setNegativeButtonText() implemented, then you MUST implement this method as well.
                        // Better implementation is on its way in next version of the lib.
                    }
                })
                
                .setNeutralButtonText("Later")
                .setNeutralButtonAction(new Dialogee.NeutralButton() {
                    @Override
                    public void action() {
                        // PLEASE NOTE
                        // If you have setNeutralButtonText() implemented, then you MUST implement this method as well.
                        // Better implementation is on its way in next version of the lib.
                    }
                })
                
                .setIcon(R.mipmap.ic_launcher) // or any resource path (in int) like R.drawable.ic_action
                
                .build() // this would return you an instance of Dialogee class object. You could either use that and call .show() on it, or you could directly call it here.
                
                .show();
```

## Screenshot
![alt text](https://github.com/mumayank/Dialogee/blob/master/images%20for%20github/Screenshot_1506834244.png)

## Download
The lib is hosted on jcenter (the default for android), hence just include the following line in your `app` level `gradle.build` under `dependencies`:
```gradle
compile 'com.mumayank:dialogee:1.0'
```
