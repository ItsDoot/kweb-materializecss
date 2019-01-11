package io.kweb.plugins.materializecss

import io.kweb.dom.attributes.AttributeBuilder
import io.kweb.dom.attributes.classes
import kotlin.reflect.KProperty

class MaterializeCssClasses : AttributeBuilder() {

    val tiny by "tiny"

    val small by "small"

    val medium by "medium"

    val large by "large"

    val active by "active"

    val avatar by "avatar"

    val disabled by "disabled"

    val big by "big"

    /*
     * Color
     */

    val red by "red"

    val redText by "red-text"

    val pink by "pink"

    val pinkText by "pink-text"

    val purple by "purple"

    val purpleText by "purple-text"

    val deepPurple by "deep-purple"

    val deepPurpleText by "deep-purple-text"

    val indigo by "indigo"

    val indigoText by "indigo-text"

    val blue by "blue"

    val blueText by "blue-text"

    val lightBlue by "light-blue"

    val lightBlueText by "light-blue-text"

    val cyan by "cyan"

    val cyanText by "cyan-text"

    val teal by "teal"

    val tealText by "teal-text"

    val green by "green"

    val greenText by "green-text"

    val lightGreen by "light-green"

    val lightGreenText by "light-green-text"

    val lime by "lime"

    val limeText by "lime-text"

    val yellow by "yellow"

    val yellowText by "yellow-text"

    val amber by "amber"

    val amberText by "amber-text"

    val orange by "orange"

    val orangeText by "orange-text"

    val deepOrange by "deep-orange"

    val deepOrangeText by "deep-orange-text"

    val brown by "brown"

    val brownText by "brown-text"

    val grey by "grey"

    val greyText by "grey-text"

    val blueGrey by "blue-grey"

    val blueGreyText by "blue-grey-text"

    val black by "black"

    val blackText by "black-text"

    val white by "white"

    val whiteText by "white-text"

    val transparent by "transparent"

    val transparentText by "transparent-text"

    fun lighten(n: Int): MaterializeCssClasses {
        classes("lighten-$n")
        return this
    }

    fun darken(n: Int): MaterializeCssClasses {
        classes("darken-$n")
        return this
    }

    fun accent(n: Int): MaterializeCssClasses {
        classes("accent-$n")
        return this
    }

    /*
     * Grid
     */

    val container by "container"

    val row by "row"

    val col by "col"

    fun s(n: Int): MaterializeCssClasses {
        classes("s$n")
        return this
    }

    fun m(n: Int): MaterializeCssClasses {
        classes("m$n")
        return this
    }

    fun l(n: Int): MaterializeCssClasses {
        classes("l$n")
        return this
    }

    fun offsetS(n: Int): MaterializeCssClasses {
        classes("offset-s$n")
        return this
    }

    fun pushS(n: Int): MaterializeCssClasses {
        classes("push-s$n")
        return this
    }

    fun pullS(n: Int): MaterializeCssClasses {
        classes("pull-s$n")
        return this
    }

    val divider by "divider"

    val section by "section"

    /*
     * Helpers
     */

    val valignWrapper by "valign-wrapper"

    val leftAlign by "left-align"

    val centerAlign by "center-align"

    val rightAlign by "right-align"

    val left by "left"

    val center by "center"

    val right by "right"

    val hide by "hide"

    val hideOnSmallOnly by "hide-on-small-only"

    val hideOnMedOnly by "hide-on-med-only"

    val hideOnMedAndDown by "hide-on-med-and-down"

    val hideOnMedAndUp by "hide-on-med-and-up"

    val hideOnLargeOnly by "hide-on-large-only"

    val showOnSmall by "show-on-small"

    val showOnMedium by "show-on-medium"

    val showOnLarge by "show-on-large"

    val showOnMediumAndUp by "show-on-medium-and-up"

    val showOnMediumAndDown by "show-on-medium-and-down"

    val truncate by "truncate"

    val hoverable by "hoverable"

    /*
     * Media
     */

    val responsiveImg by "responsive-img"

    val videoContainer by "video-container"

    val responsiveVideo by "responsive-video"

    val materialboxed by "material-boxed"

    val slider by "slider"

    val slides by "slides"

    val caption by "caption"

    /*
     * Pulse
     */

    val pulse by "pulse"

    /*
     * Shadow
     */

    fun zDepth(n: Int): MaterializeCssClasses {
        classes("z-depth-$n")
        return this
    }

    /*
     * Table
     */

    val striped by "striped"

    val highlight by "highlight"

    val centered by "centered"

    val responsiveTable by "responsive-table"

    /*
     * Transitions
     */

    val scaleTransition by "scale-transition"

    val scaleIn by "scale-in"

    val scaleOut by "scale-out"

    /*
     * Typography
     */

    val flowText by "flow-text"

    /*
     * Badges
     */

    val badge by "badge"

    val newB by "new"

    /*
     * Buttons
     */

    val btn by "btn"

    val btnFloating by "btn-floating"

    val btnFlat by "btn-flat"

    val btnLarge by "btn-large"

    val btnSmall by "btn-small"

    /*
     * Floating Action Button
     */

    val fixedActionBtn by "fixed-action-btn"

    /*
     * Breadcrumbs
     */

    val breadcrumb by "breadcrumb"

    /*
     * Cards
     */

    val card by "card"

    val cardContent by "card-content"

    val cardTitle by "card-title"

    val cardAction by "card-action"

    val cardImage by "card-image"

    val cardStacked by "card-stacked"

    val cardReveal by "card-reveal"

    val stickyAction by "sticky-action"

    val cardPanel by "card-panel"

    val cardTabs by "card-tabs"

    /*
     * Collections
     */

    val collection by "collection"

    val collectionItem by "collection-item"

    val withHeader by "with-header"

    val collectionHeader by "collection-header"

    val secondaryContent by "secondary-content"

    /*
     * Footer
     */

    val pageFooter by "page-footer"

    val footerCopyright by "footer-copyright"

    /*
     * Icons
     */

    val materialIcons by "material-icons"

    /*
     * Navbar
     */

    val navExtended by "nav-extended"

    val navbarFixed by "navbar-fixed"

    val navWrapper by "nav-wrapper"

    val navMobile by "nav-mobile"

    val navContent by "nav-content"

    val navTitle by "nav-title"

    val brandLogo by "brand-logo"

    /*
     * Pagination
     */

    val pagination by "pagination"

    /*
     * Preloader
     */

    val preloaderWrapper by "preloader-wrapper"

    val progress by "progress"

    val determinate by "determinate"

    val indeterminate by "indeterminate"

    val spinnerLayer by "spinner-layer"

    val spinnerRed by "spinner-red"

    val spinnerRedOnly by "spinner-red-only"

    val spinnerGreen by "spinner-green"

    val spinnerGreenOnly by "spinner-green-only"

    val spinnerBlue by "spinner-blue"

    val spinnerBlueOnly by "spinner-blue-only"

    val spinnerYellow by "spinner-yellow"

    val spinnerYellowOnly by "spinner-yellow-only"

    val circleClipper by "circle-clipper"

    val circle by "circle"

    val gapPatch by "gap-patch"

    /*
     * Carousel
     */

    val carousel by "carousel"

    val carouselItem by "carousel-item"

    val carouselSlider by "carousel-slider"

    val carouselFixedItem by "carousel-fixed-item"

    /*
     * Collapsible
     */

    val collapsible by "collapsible"

    val collapsibleHeader by "collapsible-header"

    val collapsibleBody by "collapsible-body"

    val collapsibleAccordion by "collapsible-accordion"

    val expandable by "expandable"

    val popout by "popout"

    /*
     * Dropdown
     */

    val dropdownTrigger by "dropdown-trigger"

    val dropdownContent by "dropdown-content"

    /*
     * Feature Discovery
     */

    val tapTarget by "tap-target"

    val tapTargetContent by "tap-target-content"

    /*
     * Modal
     */

    val modal by "modal"

    val modalContent by "modal-content"

    val modalFooter by "modal-footer"

    val modalFixedFooter by "modal-fixed-footer"

    val bottomSheet by "bottom-sheet"

    val modalTrigger by "modal-trigger"

    /*
     * Parallax
     */

    val parallaxContainer by "parallax-container"

    val parallax by "parallax"

    /*
     * Scrollspy
     */

    val scrollspy by "scrollspy"

    /*
     * Sidenav
     */

    val sidenav by "sidenav"

    val sidenavFixed by "sidenav-fixed"

    val sidenavClose by "sidenav-close"

    val sidenavTrigger by "sidenav-trigger"

    /*
     * Tabs
     */

    val tabs by "tabs"

    val tabsFixedWidth by "tabs-fixed-width"

    val tab by "tab"

    /*
     * Toasts
     */

    val toastAction by "toast-action"

    /*
     * Tooltips
     */

    val tooltipped by "tooltipped"

    /*
     * Waves
     */

    val wavesEffect by "waves-effect"

    val wavesCircle by "waves-circle"

    val wavesLight by "waves-light"

    val wavesRed by "waves-light"

    val wavesYellow by "waves-light"

    val wavesOrange by "waves-light"

    val wavesPurple by "waves-light"

    val wavesGreen by "waves-light"

    val wavesTeal by "waves-light"

    /*
     * Forms
     */

    val inputField by "input-field"

    val inline by "inline"

    private operator fun String.getValue(self: Any, property: KProperty<*>): MaterializeCssClasses {
        classes(this)
        return this@MaterializeCssClasses
    }

    private fun addClasses(vararg classes: String): MaterializeCssClasses {
        classes(*classes)
        return this
    }
}