package com.emojipilot.app

import android.accessibilityservice.AccessibilityService
import android.view.accessibility.AccessibilityEvent

class PilotAccessibilityService : AccessibilityService() {
    override fun onAccessibilityEvent(event: AccessibilityEvent?) {}
    override fun onInterrupt() {}
}
