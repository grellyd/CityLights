CityLights
==========

A procedurally generated world progression simulation with a focus on initial world creation and civilisation growth.

Milestones: 

Map:
- Research into the bases of procedurally generated content. (complete)
- Creation of a grid structure to handle the map elements on a macro scale (in progress)
- Implementation of the Perlin Noise generator (in progress)
- -->Initial structures (complete)
- --> Prime number generator (testing required)
- --> Creating unique vectors for each tile corner, which will be shared with neighboring tiles (theory complete, code needed)
- --> Noise generation on a single tile
- --> Smoothing of noise function
- --> Application to the entire grid
- Creation of a sub-grid structure (a grid within each tile) to handle map elements on a normal scale.
- Creation of a secondary-sub-grid structure to handle map elements on a micro scale.
- Translation of perlin noise values into elevation
- Choosing peaks and valleys, with smoothing in between. 
- Generation/selection of water presence in high/medium/low elevation 
- --> Selecting sea level and marking(?) the underwater tiles. 
- --> Creation of lakes and rivers at high/medium/low elevations
- Division of biomes based upon environmental factors

Civilisations:
- Placement bias
- Growth factors
- Interaction between populations, and subsequent growth/regression.
- Random environmental effects (disasters etc.)
- Technological effects/change.
- Culture growth/impacts/spread. 

History:
- Recording of world creation in a form similar to a debug log, but more reader friendly. 
- Recording of civilisation histories
- --> Grouped by civilisations with events in chronological order. 
- --> Notes events of significance
- --> Notes persons of significance
- --> Notes significant changes within the civilisation
