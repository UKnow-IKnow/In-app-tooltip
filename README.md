# In-app-tooltip

![Android](https://img.shields.io/badge/Android-3DDC84?style=for-the-badge&logo=android&logoColor=white)
![Kotlin](https://img.shields.io/badge/Kotlin-0095D5?&style=for-the-badge&logo=kotlin&logoColor=white)

## Features:
- Ability to set the target element, position (top/start/bottom/end), style and text ofthe tooltip.
- The tooltip works seamlessly for buttons at any location of the mobile screen preview
- Ability to include an image inside tooltip.

## Demo

<div>
  <img src=https://github.com/UKnow-IKnow/In-app-tooltip/assets/92221289/3e230324-48f2-4082-bd3e-988f7af8d430.gif width="200" height="400">
  <img src=https://github.com/UKnow-IKnow/In-app-tooltip/assets/92221289/5f0eed2a-475f-4ff5-aa1c-4e3dbc071a76.jpg width="200" height="400">
  <img src=https://github.com/UKnow-IKnow/In-app-tooltip/assets/92221289/0601934a-2f11-429f-bd44-eb0feae22afb.jpg width="200" height="400">
  <img src=https://github.com/UKnow-IKnow/In-app-tooltip/assets/92221289/2a6a51f9-b2b7-4643-bf1e-fb6a1c74484c.jpg width="200" height="400">
  <img src=https://github.com/UKnow-IKnow/In-app-tooltip/assets/92221289/a1137a64-19bc-4822-add5-73f538503ac7.jpg width="200" height="400">
</div>

## How to Use

Once the builder has been initialized, you can configure your tooltip

## Method to config:

* To set text  
`builder.text(text)`

* To set text color  
`builder.textColor(colorInt)`

* To set text size  
`builder.textSize(textSize)`  

* To enable a start icon(by default disabled)  
`builder.iconStart(icon)`  

* To set the start icon margin in px  
`builder.iconStartMargin(left, top, right, bottom)`  

* To set the start icon size in px  
`builder.iconStartSize(h, w)`  

* To enable a end icon(by default disabled)  
`builder.iconEnd(icon)`  

* To set the end icon margin in px  
`builder.iconEndMargin(left, top, right, bottom)`  

* To set the end icon size in px  
`builder.iconEndSize(h, w)`  

* To set a top drawable  
`builder.drawableTop(drawable)`  

* To set a bottom drawable  
`builder.drawableBottom(drawable)`  

* To set the tooltip bubble color  
`builder.color(color)`  

* To set the tooltip content padding in px  
`builder.padding(top, right, bottom, left)`  

* To set the position of the tooltip in relation to the view to which it points(by deafult Bottom)  
`builder.position(position)`  

* To set the corner radius in px of the tooltip bubble  
`builder.corner(radius)`  

* To enable autohide on tap(by default is enabled)  
`builder.clickToHide(bool)`  

* To set the the border color and width in px  
`builder.border(color, width)`    

* To set the arrow size  
`builder.arrowSize(h, w)`  

* To set a tooltip minWidth in px if the space in parent isn't enough the tooltip will be relocated to the opposite position  
`builder.minWidth(w)`  

* To set a tooltip minHeight in px if the space in parent isn't enough the tooltip will be relocated to the opposite position  
`builder.minHeight(w)`   

#### Show options

`builder.show()`  
`builder.show(duration)`    

* To close the tooltip with animation  
`tooltip.close()`
