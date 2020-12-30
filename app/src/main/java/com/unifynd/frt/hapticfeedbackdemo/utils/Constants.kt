package com.unifynd.frt.hapticfeedbackdemo.utils

import com.immersion.uhl.Launcher

/**
 * Created by Harsh Rajgor on 29/12/20.
 */

class Constants {

    enum class ImmersionHapticsMapping(val hapticName: String, val hapticId: Int) {
        SHARP_CLICK_100("SHARP_CLICK_100", Launcher.SHARP_CLICK_100),
        SHARP_CLICK_66("SHARP_CLICK_66", Launcher.SHARP_CLICK_66),
        SHARP_CLICK_33("SHARP_CLICK_33", Launcher.SHARP_CLICK_33),
        STRONG_CLICK_100("STRONG_CLICK_100", Launcher.STRONG_CLICK_100),
        STRONG_CLICK_66("STRONG_CLICK_66", Launcher.STRONG_CLICK_66),
        STRONG_CLICK_33("STRONG_CLICK_33", Launcher.STRONG_CLICK_33),
        BUMP_100("BUMP_100", Launcher.BUMP_100),
        BUMP_66("BUMP_66", Launcher.BUMP_66),
        BUMP_33("BUMP_33", Launcher.BUMP_33),
        BOUNCE_100("BOUNCE_100", Launcher.BOUNCE_100),
        BOUNCE_66("BOUNCE_66", Launcher.BOUNCE_66),
        BOUNCE_33("BOUNCE_33", Launcher.BOUNCE_33),
        DOUBLE_SHARP_CLICK_100("DOUBLE_SHARP_CLICK_100", Launcher.DOUBLE_SHARP_CLICK_100),
        DOUBLE_SHARP_CLICK_66("DOUBLE_SHARP_CLICK_66", Launcher.DOUBLE_SHARP_CLICK_66),
        DOUBLE_SHARP_CLICK_33("DOUBLE_SHARP_CLICK_33", Launcher.DOUBLE_SHARP_CLICK_33),
        DOUBLE_STRONG_CLICK_100("DOUBLE_STRONG_CLICK_100", Launcher.DOUBLE_STRONG_CLICK_100),
        DOUBLE_STRONG_CLICK_66("DOUBLE_STRONG_CLICK_66", Launcher.DOUBLE_STRONG_CLICK_66),
        DOUBLE_STRONG_CLICK_33("DOUBLE_STRONG_CLICK_33", Launcher.DOUBLE_STRONG_CLICK_33),
        DOUBLE_BUMP_100("DOUBLE_BUMP_100", Launcher.DOUBLE_BUMP_100),
        DOUBLE_BUMP_66("DOUBLE_BUMP_66", Launcher.DOUBLE_BUMP_66),
        DOUBLE_BUMP_33("DOUBLE_BUMP_33", Launcher.DOUBLE_BUMP_33),
        TRIPLE_STRONG_CLICK_100("TRIPLE_STRONG_CLICK_100", Launcher.TRIPLE_STRONG_CLICK_100),
        TRIPLE_STRONG_CLICK_66("TRIPLE_STRONG_CLICK_66", Launcher.TRIPLE_STRONG_CLICK_66),
        TRIPLE_STRONG_CLICK_33("TRIPLE_STRONG_CLICK_33", Launcher.TRIPLE_STRONG_CLICK_33),
        TICK_100("TICK_100", Launcher.TICK_100),
        TICK_66("TICK_66", Launcher.TICK_66),
        TICK_33("TICK_33", Launcher.TICK_33),
        LONG_BUZZ_100("LONG_BUZZ_100", Launcher.LONG_BUZZ_100),
        LONG_BUZZ_66("LONG_BUZZ_66", Launcher.LONG_BUZZ_66),
        LONG_BUZZ_33("LONG_BUZZ_33", Launcher.LONG_BUZZ_33),
        SHORT_BUZZ_100("SHORT_BUZZ_100", Launcher.SHORT_BUZZ_100),
        SHORT_BUZZ_66("SHORT_BUZZ_66", Launcher.SHORT_BUZZ_66),
        SHORT_BUZZ_33("SHORT_BUZZ_33", Launcher.SHORT_BUZZ_33),
        LONG_TRANSITION_RAMP_UP_100("LONG_TRANSITION_RAMP_UP_100", Launcher.LONG_TRANSITION_RAMP_UP_100),
        LONG_TRANSITION_RAMP_UP_66("LONG_TRANSITION_RAMP_UP_66", Launcher.LONG_TRANSITION_RAMP_UP_66),
        LONG_TRANSITION_RAMP_UP_33("LONG_TRANSITION_RAMP_UP_33", Launcher.LONG_TRANSITION_RAMP_UP_33),
        SHORT_TRANSITION_RAMP_UP_100("SHORT_TRANSITION_RAMP_UP_100", Launcher.SHORT_TRANSITION_RAMP_UP_100),
        SHORT_TRANSITION_RAMP_UP_66("SHORT_TRANSITION_RAMP_UP_66", Launcher.SHORT_TRANSITION_RAMP_UP_66),
        SHORT_TRANSITION_RAMP_UP_33("SHORT_TRANSITION_RAMP_UP_33", Launcher.SHORT_TRANSITION_RAMP_UP_33),
        LONG_TRANSITION_RAMP_DOWN_100("LONG_TRANSITION_RAMP_DOWN_100", Launcher.LONG_TRANSITION_RAMP_DOWN_100),
        LONG_TRANSITION_RAMP_DOWN_66("LONG_TRANSITION_RAMP_DOWN_66", Launcher.LONG_TRANSITION_RAMP_DOWN_66),
        LONG_TRANSITION_RAMP_DOWN_33("LONG_TRANSITION_RAMP_DOWN_33", Launcher.LONG_TRANSITION_RAMP_DOWN_33),
        SHORT_TRANSITION_RAMP_DOWN_100("SHORT_TRANSITION_RAMP_DOWN_100", Launcher.SHORT_TRANSITION_RAMP_DOWN_100),
        SHORT_TRANSITION_RAMP_DOWN_66("SHORT_TRANSITION_RAMP_DOWN_66", Launcher.SHORT_TRANSITION_RAMP_DOWN_66),
        SHORT_TRANSITION_RAMP_DOWN_33("SHORT_TRANSITION_RAMP_DOWN_33", Launcher.SHORT_TRANSITION_RAMP_DOWN_33),
        FAST_PULSE_100("FAST_PULSE_100", Launcher.FAST_PULSE_100),
        FAST_PULSE_66("FAST_PULSE_66", Launcher.FAST_PULSE_66),
        FAST_PULSE_33("FAST_PULSE_33", Launcher.FAST_PULSE_33),
        FAST_PULSING_100("FAST_PULSING_100", Launcher.FAST_PULSING_100),
        FAST_PULSING_66("FAST_PULSING_66", Launcher.FAST_PULSING_66),
        FAST_PULSING_33("FAST_PULSING_33", Launcher.FAST_PULSING_33),
        SLOW_PULSE_100("SLOW_PULSE_100", Launcher.SLOW_PULSE_100),
        SLOW_PULSE_66("SLOW_PULSE_66", Launcher.SLOW_PULSE_66),
        SLOW_PULSE_33("SLOW_PULSE_33", Launcher.SLOW_PULSE_33),
        SLOW_PULSING_100("SLOW_PULSING_100", Launcher.SLOW_PULSING_100),
        SLOW_PULSING_66("SLOW_PULSING_66", Launcher.SLOW_PULSING_66),
        SLOW_PULSING_33("SLOW_PULSING_33", Launcher.SLOW_PULSING_33),
        TRANSITION_BUMP_100("TRANSITION_BUMP_100", Launcher.TRANSITION_BUMP_100),
        TRANSITION_BUMP_66("TRANSITION_BUMP_66", Launcher.TRANSITION_BUMP_66),
        TRANSITION_BUMP_33("TRANSITION_BUMP_33", Launcher.TRANSITION_BUMP_33),
        TRANSITION_BOUNCE_100("TRANSITION_BOUNCE_100", Launcher.TRANSITION_BOUNCE_100),
        TRANSITION_BOUNCE_66("TRANSITION_BOUNCE_66", Launcher.TRANSITION_BOUNCE_66),
        TRANSITION_BOUNCE_33("TRANSITION_BOUNCE_33", Launcher.TRANSITION_BOUNCE_33),
        ALERT1("ALERT1", Launcher.ALERT1),
        ALERT2("ALERT2", Launcher.ALERT2),
        ALERT3("ALERT3", Launcher.ALERT3),
        ALERT4("ALERT4", Launcher.ALERT4),
        ALERT5("ALERT5", Launcher.ALERT5),
        ALERT6("ALERT6", Launcher.ALERT6),
        ALERT7("ALERT7", Launcher.ALERT7),
        ALERT8("ALERT8", Launcher.ALERT8),
        ALERT9("ALERT9", Launcher.ALERT9),
        ALERT10("ALERT10", Launcher.ALERT10),
        EXPLOSION1("EXPLOSION1", Launcher.EXPLOSION1),
        EXPLOSION2("EXPLOSION2", Launcher.EXPLOSION2),
        EXPLOSION3("EXPLOSION3", Launcher.EXPLOSION3),
        EXPLOSION4("EXPLOSION4", Launcher.EXPLOSION4),
        EXPLOSION5("EXPLOSION5", Launcher.EXPLOSION5),
        EXPLOSION6("EXPLOSION6", Launcher.EXPLOSION6),
        EXPLOSION7("EXPLOSION7", Launcher.EXPLOSION7),
        EXPLOSION8("EXPLOSION8", Launcher.EXPLOSION8),
        EXPLOSION9("EXPLOSION9", Launcher.EXPLOSION9),
        EXPLOSION10("EXPLOSION10", Launcher.EXPLOSION10),
        WEAPON1("WEAPON1", Launcher.WEAPON1),
        WEAPON2("WEAPON2", Launcher.WEAPON2),
        WEAPON3("WEAPON3", Launcher.WEAPON3),
        WEAPON4("WEAPON4", Launcher.WEAPON4),
        WEAPON5("WEAPON5", Launcher.WEAPON5),
        WEAPON6("WEAPON6", Launcher.WEAPON6),
        WEAPON7("WEAPON7", Launcher.WEAPON7),
        WEAPON8("WEAPON8", Launcher.WEAPON8),
        WEAPON9("WEAPON9", Launcher.WEAPON9),
        WEAPON10("WEAPON10", Launcher.WEAPON10),
        IMPACT_WOOD_100("IMPACT_WOOD_100", Launcher.IMPACT_WOOD_100),
        IMPACT_WOOD_66("IMPACT_WOOD_66", Launcher.IMPACT_WOOD_66),
        IMPACT_WOOD_33("IMPACT_WOOD_33", Launcher.IMPACT_WOOD_33),
        IMPACT_METAL_100("IMPACT_METAL_100", Launcher.IMPACT_METAL_100),
        IMPACT_METAL_66("IMPACT_METAL_66", Launcher.IMPACT_METAL_66),
        IMPACT_METAL_33("IMPACT_METAL_33", Launcher.IMPACT_METAL_33),
        IMPACT_RUBBER_100("IMPACT_RUBBER_100", Launcher.IMPACT_RUBBER_100),
        IMPACT_RUBBER_66("IMPACT_RUBBER_66", Launcher.IMPACT_RUBBER_66),
        IMPACT_RUBBER_33("IMPACT_RUBBER_33", Launcher.IMPACT_RUBBER_33),
        TEXTURE1("TEXTURE1", Launcher.TEXTURE1),
        TEXTURE2("TEXTURE2", Launcher.TEXTURE2),
        TEXTURE3("TEXTURE3", Launcher.TEXTURE3),
        TEXTURE4("TEXTURE4", Launcher.TEXTURE4),
        TEXTURE5("TEXTURE5", Launcher.TEXTURE5),
        TEXTURE6("TEXTURE6", Launcher.TEXTURE6),
        TEXTURE7("TEXTURE7", Launcher.TEXTURE7),
        TEXTURE8("TEXTURE8", Launcher.TEXTURE8),
        TEXTURE9("TEXTURE9", Launcher.TEXTURE9),
        TEXTURE10("TEXTURE10", Launcher.TEXTURE10),
        ENGINE1_100("ENGINE1_100", Launcher.ENGINE1_100),
        ENGINE1_66("ENGINE1_66", Launcher.ENGINE1_66),
        ENGINE1_33("ENGINE1_33", Launcher.ENGINE1_33),
        ENGINE2_100("ENGINE2_100", Launcher.ENGINE2_100),
        ENGINE2_66("ENGINE2_66", Launcher.ENGINE2_66),
        ENGINE2_33("ENGINE2_33", Launcher.ENGINE2_33),
        ENGINE3_100("ENGINE3_100", Launcher.ENGINE3_100),
        ENGINE3_66("ENGINE3_66", Launcher.ENGINE3_66),
        ENGINE3_33("ENGINE3_33", Launcher.ENGINE3_33),
        ENGINE4_100("ENGINE4_100", Launcher.ENGINE4_100),
        ENGINE4_66("ENGINE4_66", Launcher.ENGINE4_66),
        ENGINE4_33("ENGINE4_33", Launcher.ENGINE4_33),
    }

}