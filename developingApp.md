<h1 align="center"><img src="https://global-uploads.webflow.com/5dcc26d1cb881d7a98f0a292/621cd8cab7c447c3b05a5157_Ako%20na%20Vy%CC%81voj%20Android%20aplika%CC%81cii%CC%81-%20Tipy%20a%20na%CC%81vody%20pre%20developerov.jpg" height=160> <br> Developing-Android-Apps </h1>


 <h2> Topics : </h2>

 ---

### <u>1. Scroll-View Example App:</u>


> App with ScrollView and HorizontalScrollView having a set of buttons inside it.
- ScrollView
- HorizontalScrollView
- Button
- LinearLayout
- TextView


[XML Code](Xml/P28.xml) 

[Kotlin Code](Kotlin/P28.kt)

[Output Screenshot](Images/S28.png)

---

### <u>2. Tool-Bar Example App:</u>

> App with Toolbar having a set of buttons inside it.
- Toolbar
- Button
- RelativeLayout
- TextView

Firstly, Go to res > values > themes.xml(both files) and change the theme from DarkActionBar to NoActionBar otherwise the app may crash.



[Menu file](Xml/P29_a.xml) 

[XML Code](Xml/P29.xml)

[Kotlin Code](Kotlin/P29.kt)

[Output Screenshot](Images/S29.png)


---


### <u>3. Rating Bar Example App:</u>

> App with RatingBar and a submit button which display a toast clicked on it
- RatingBar
- Button
- RelativeLayout
- TextView

[XML Code](Xml/P30.xml)

[Kotlin Code](Kotlin/P30.kt)

[Output Screenshot](Images/S30.png)


---

### <u>4. Splash Screen Example App:</u>

> App with Splash Screen. Splash Screen is a screen which is displayed when the app is launched. It is used to display the logo of the app or some other information for a short period of time.
- Handler
- Runnable
- Intent
- RelativeLayout

[XML Code](Xml/P31.xml)

[Kotlin Code](Kotlin/P31.kt)

[Output Screenshot](Images/S31.png)


---

### <u>5. Custom-Toast Example App:</u>

> App with a button that shows a Custom Toast when click on it. Custom Toast is a toast which is displayed with a custom layout.
- Toast
- Button
- ConstraintLayout

[Custom Toast Layout file](Xml/P32_a.xml)

[XML Code](Xml/P32.xml)

[Kotlin Code](Kotlin/P32.kt)

[Output Screenshot](Images/S32.png)


---


### <u>6. Progress Bar Example App:</u>

> App with a button that shows a Progress Bar when click on it. Progress Bar is a bar which is displayed to show the progress of some task.
- ProgressBar
- Button
- ConstraintLayout

[XML Code](Xml/P33.xml)

[Kotlin Code](Kotlin/P33.kt)

[Output Screenshot](Images/S33.png)


---

### <u>7. Footer Example App:</u>

> Footer is also known as Bottom Navigation Bar. It is a bar which is displayed at the bottom of the screen. It is used to navigate between different activities or fragments. In this app, we have a footer with 4 items. When we click on any item, the textView is changed to the name of the item.
- BottomNavigationView
- TextView
- ConstrainLayout
- Menu

[Menu file](Xml/P34_a.xml)

[XML Code](Xml/P34.xml)

[Kotlin Code](Kotlin/P34.kt)

[Output Screenshot](Images/S34.png)


---


### <u>8. Alarm Manager Example App:</u>

> App with an edit text and a button. When we enter the time in the edit text and click on the button, the alarm is set for that time. When the alarm is triggered, a toast is displayed and the alarm is played. We can cancel the alarm by clicking on the cancel button. We can create a repeating alarm by clicking on the repeating button.
- AlarmManager
- PendingIntent
- BroadcastReceiver
- Intent
- EditText
- Button

Add a ringtone in the raw folder.

Add a permission in the manifest file under the application tag.

```<uses-permission android:name="android.permission.RECEIVE_BOOT_COMPLETED" />```

Add a receiver with the name same as class name of the BroadcastReceiver in the manifest file under the application tag.

```<receiver android:name=".AlarmManagerBroadcast" />```

[XML Code](Xml/P35.xml)

[Kotlin Code](Kotlin/P35.kt)

[Output Screenshot](Images/S35.png)


---

### <u>9. Job Scheduler Example App:</u>

> App with a button that shows a Job Scheduler when click on it. Job Scheduler is a service which is used to perform some task at a specific time. In this app, we have a button which starts the job scheduler. When the job scheduler is triggered, a toast is displayed and the alarm is played. We can cancel the job scheduler by clicking on the stop job button. 
- JobScheduler
- JobService
- AlarmManager
- PendingIntent
- BroadcastReceiver


Add AlarmManagerBroadcast and all permissions in manifest file from the above example.

Add a service with the name same as class name of the JobService in the manifest file under the application tag.

```
<service
            android:name=".MyJobService"
            android:exported="true"
            android:permission="android.permission.BIND_JOB_SERVICE" />
            
```

[XML Code](Xml/P36.xml)

[Kotlin Code](Kotlin/P36.kt)

[Output Screenshot](Images/S36.png)



---


### <u>10. Notification Example App:</u>

> App with a button that shows a Notification when click on it. Notification is a message which is displayed outside the app. When the user clicks on the notification, the app is opened and the user is taken to the activity which is specified in the intent and shown the message.
- Notification
- NotificationManager
- NotificationChannel
- PendingIntent
- Intent
- Builder


| XML Codes | Kotlin Codes|  Output |
|-----------|:-----------:| :-----------:|
| [1'st activity](Xml/P37_a.xml) | [1'st activity](Kotlin/P37_a.kt) |  | 
| [2'nd activity](Xml/P37_b.xml) | [2'nd activity](Kotlin/P37_b.kt) | [Output Screenshot](Images/S37.png) |


---


### <u>11. Static Fragment Example App:</u>

> App with two fragments in a single activity. The first fragment is having a set of buttons for sending text, clear text and changing background colour of the second fragment.
- Fragment
- FragmentManager
- FragmentTransaction
- Button
- TextView


| XML Codes | Kotlin Codes|  Output |
|-----------|:-----------:| :-----------:|
| [Main activity](Xml/P38.xml) | [Main activity](Kotlin/P38.kt) |  | 
| [1'st fragment](Xml/P38_a.xml) | [1'st fragment](Kotlin/P38_a.kt) | |
| [2'nd fragment](Xml/P38_b.xml) | [2'nd fragment](Kotlin/P38_b.kt) | [Output Screenshot](Images/S38.png) |
|  | [Text Interface](Kotlin/P38_c.kt)| |
|  | [Color Interface](kotlin/P38_d.kt)| |


---


### <u>12. Fragment with ListView:</u>

> App with two fragments in a single activity. The first fragment is having a list of items. When we click on any item, the second fragment is displayed with the name of the item. It also shows how to pass data from one fragment to another fragment.
- Fragment
- FragmentManager
- ListView
- Button
- TextView


| XML Codes | Kotlin Codes|  Output |
|-----------|:-----------:| :-----------:|
| [Main activity](Xml/P39.xml) | [Main activity](Kotlin/P39.kt) |  | 
| [1'st fragment](Xml/P39_a.xml) | [1'st fragment](Kotlin/P39_a.kt) | [Output Screenshot](Images/S39.png) |
| [2'nd fragment](Xml/P39_b.xml) | [2'nd fragment](Kotlin/P39_b.kt) | |


---

### <u>13. Dynamic Fragment Example App:</u>

> App with two fragments. The fragments are displayed depending on the orientation of the device. When the device is in portrait mode, the first fragment is displayed. When the device is in landscape mode, the second fragment is displayed.
- Fragment
- FragmentManager
- FragmentTransaction
- Orientation
- Button
- TextView

| XML Codes | Kotlin Codes|  Output |
|-----------|:-----------:| :-----------:|
| [Main activity](Xml/P40.xml) | [Main activity](Kotlin/P40.kt) |  | 
| [1'st fragment](Xml/P40_a.xml) | [1'st fragment](Kotlin/P40_a.kt) | [Output Screenshot](Images/S40.png) |
| [2'nd fragment](Xml/P40_b.xml) | [2'nd fragment](Kotlin/P40_b.kt) | |


---

### <u>14. Custom View Example App:</u>

> App with a custom view. The activity is having a custom views as a rectange and three arc which is making a fan shape. When user tap on it, then the fan translates which seems like a fan is rotating. 
- CustomView
- Canvas
- Paint
- Path

[XML Code](Xml/P41.xml)

[Kotlin Code](Kotlin/P41.kt)

[CustomView Code](Kotlin/P41_a.kt)

[Output Screenshot](Images/S41.png)


---

### <u>15. Simple Drawing App:</u>

> App that allows the user to draw on the screen. It has a button to clear the canvas.
- Canvas
- Paint
- Path
- Button

[XML Code](Xml/P42.xml)

[Kotlin Code](Kotlin/P42.kt)

[CustomView Code](Kotlin/P42_a.kt)

[Output Screenshot](Images/S42.png)


---

