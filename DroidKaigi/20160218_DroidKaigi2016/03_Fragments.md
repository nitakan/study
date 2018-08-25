# Fragments - Why? How? What for?
@Adrina Cook
@kenidoggy

## who needs fragments ?
 you do!

## Why

* smaller View Controllers
* ReUseable UI & Logic Components
	* Address device fragmentatuib
	* Decomposition

## How do they work?
* lifecycle
* static vs dinamic

Dynamic Fragment

* public Constractor
* New Instances  

```
Fragment.newInstance();
Fragment f = new Fragment();
Bundle args = new Bundle();
args.putInt(KEY_POSITION, 1);
f.setArguments(args);

``` 
* Destraction
	* setRetailInstance(true)

* ViewPageAdapter

* Navigation Drawer
* saved Fragments
