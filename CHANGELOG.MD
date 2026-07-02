# Changelog

Satan's Deco: Bars Mayhem - later on - Project

All notable changes to Project will be documented in this file.

The format is based on [Low Cortisol Changelog 0.1.0] guideline.

Implements following modifications:
 1) YANKED tag can be used for scrapped versions.
 2) Release entries can be united by usage of `&`. In that case it omitts date of older entry.
 3) United entries are encouraged to misfollow the guideline.
 4) Project also known as: mod. 
 5) For Added category references can be omitted. 

Implements following subcategories in order:
 1) Unclassified
 2) Game Mechanics 
 3) Blocks & Items
 4) Textures & Models

Project adheres to [Semantic Versioning](https://semver.org/spec/v2.0.0.html).

## [Planned]
### Added
- [since 0.1.0] Add German (de_de) translation
- [since 0.1.0] Add Kazakh (kk_kz) translation
- [since 0.1.0] Add Polish (pl_pl) translation
- [since 0.1.0] Add Russian (ru_ru) translation
- [since 0.1.0] Add Spanish (es_es) translation
- [since 0.1.0] Add Ukrainian (uk_ua) translation
- [since 0.1.0] Add Portuguese (pt_pt) translation
- [since 0.3.0] Publish mod on Modrinth
- [since 0.3.0] Port mod to 1.21.1
- [since 0.3.1] Port mod to 26.x

### Changes
#### Unclassified
- [since 0.3.0] Change class naming from DecoName to BMName
- [since 0.1.0] Optimize datagen 

### Removed
- [since 0.1.0] Remove Barses textures under numbers 25, 29, 31, 32

## [0.3.2] - 2026-07-03
### Added
#### Game Mechanics
- Add custom collision boxes for variations under numbers 3, 4, 7, 8, 21
#### Textures & Models
- Add connected glass models for vitrages

## Removed
- Remove Vitrages models other than panel_pane, panel_bars, side and side_alt

## [0.3.1] - 2026-06-20
### Changed
- Undo changes of `vitrageDye`


## [0.3.0] - 2026-06-19
### Added
- Add sound events for Panels and Vitrages

### Fixed
- Fix redstone power not working properly for mod blocks
- Fix mineable and c/bars tags

### Removed
- Remove unused code and imports


## [0.2.0] - 2026-06-15
### Added
- Publish mod on Curseforge

### Changed
- **Breaking:** Move Vitrages into new project: Satan's deco: Bars Mayhem Vitrage Pack 1 ([dcfdc04](https://github.com/kittysatanicbelyah/satans_deco_bm/commit/dcfdc04ce279e3785da0b9e7375df3372084762b))
- **Breaking:** Move Curtains into new project: Satan's deco: Curtainsanity ([fc0f7e1](https://github.com/kittysatanicbelyah/satans_deco_bm/commit/fc0f7e1635f18994f9d9e582f50247388843285e))
- Change mod description to address breaking changes ([dcfdc04](https://github.com/kittysatanicbelyah/satans_deco_bm/commit/dcfdc04ce279e3785da0b9e7375df3372084762b))

### Removed
- Remove Curtains class, tag, models, textures, datagen ([fc0f7e1](https://github.com/kittysatanicbelyah/satans_deco_bm/commit/fc0f7e1635f18994f9d9e582f50247388843285e))
- Remove Vitrages tags, datagen ([dcfdc04](https://github.com/kittysatanicbelyah/satans_deco_bm/commit/dcfdc04ce279e3785da0b9e7375df3372084762b))


 ## [0.1.0] - 2026-06-14
 ### Added
#### Unclassified
- Implement data generation of .json files in .../net/satan/deco_bm/datagen (Workflow improvement)
#### Game Mechanics
- Develop Curtains functionality
- Develop Vitrages functionality, implementing `VitrageDye` class
- Implement `DecoWeatheringCopper` for copper oxidation and waxing of Barses and Panels
- Add following creative tabs: "Satan's Deco barses", "Satan's Deco Panels & Curtains", "Satan's Deco Vitrages" (Change of mod concept)
#### Blocks & Items
- Add dyed curtains
- Add Emerald, gold, dark metal, cloud, copper with oxidation stages and waxed barses and panels
- Add iron, emerald, gold, dark metal, cloud, copper and waxed vitrages
#### Textures & Models
- Add curtain_rod model
- Add curtain_cap and curtain_cap_alt models
- Add vitrage_panel_bars and vitrage_panel_pane, vitrage_side and vitrage_side_alt and some other vitrage models
- Draw Curtain textures

### Changed
#### Unclassified
- **Breaking:** Switch mod name: Old: Satan's deco (`satans_deco`); New: Satan's deco: Bars Mayhem (`satans_deco_bm`) (Change of mod concept)
- Overhaul english (en.us) translation ([0.1.0] / Changed / Blocks & Items / Change Bars registry naming...)
#### Game Mechanics
- **Breaking:** Switch Panels functionality from Mcreator procedure-based to java class integer based (.../java/net/satan/deco_bm/block/TemplatePanelBlock)
#### Blocks & Items
- **Breaking:** Overhaul Panels block rotation: Old: Y rotation; New: Horizontal Axis rotation (.../java/net/satan/deco_bm/block/TemplatePanelBlock)
- Change Bars registry naming convention: Old: [material]_bars_[shape]; New: [material]_bars[texture number] (inadequate convention)
- Rename Pane into Panel (panes already exist in Minecraft)
- Change Panel naming convention: Old: [material]_pane_[shape]; New: [material (without L for textures)]_panel(without L for textures)[texture number] (inadequate convention)
#### Textures & Models
- Change Bars custom models naming convention: Old: cloud, cloud_rev_u, cloud_rev_v, cloud_u, cloud_v; New: nonstraight, reverse_u, reverse_v, u, v (inadequate convention)

### Fixed
#### Unclassified
- Removed Mcreator generated java classes bloat (.../java/net/satan/deco_bm/block)
#### Textures & Models
- Minor fix wrongly cut textures of copper panels 12 and 9 (.../resources/assets/satans_deco_bm/textures/block)
- Fix misnaming of weathered copper panels 6, 10, 11, 12 (.../resources/assets/satans_deco_bm/textures/block)

### Removed
- Scrapped Connector Block (Change of mod concept)
- Scrapped Barses variations under numbers 25, 29, 31, 32 (Native memory allocation (mmap) failed to map 1038090240 bytes. Error detail: G1 virtual space)
- Removed older creative tab ([0.1.0] / Added / Game Mechanics / Add 3 creative tabs...)


## [00.01] & [0.2 Mcreator-2026.1] - 2026-05-05 [YANKED]
   _Scrapped versions due to optimization and workflow issues_
### Added
#### Unclassified
- Add mod folder structure
- Add english (en.us) translation
#### Game Mechanics
- Add Creative Tab for mod elements
#### Blocks & Items
- Add 34 Iron Barses
- Add Emerald Bars
- Add Connector Block
- Add Cloud and Dark metal material Items
#### Textures & Models
- Add Modified barses _side and _side_alt variations (technically they came from older scrapped project)
- Add Template pane model and pane with hole visual shape
- Draw Barses textures
- Draw Logo

 [1.1.1]: https://github.com/olivierlacan/keep-a-changelog/compare/v1.1.0...v1.1.1
