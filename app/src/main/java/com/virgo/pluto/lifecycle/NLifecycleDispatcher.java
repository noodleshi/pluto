package com.virgo.pluto.lifecycle;

/**
 * 1、初始化时，向application注入一个ActivityLifecycleCallbacks监听其生命周期变化并派发
 * 2、当Activity onCreate，activity instanceof fragmentactivity true，则向supportFragmentManager
 * 注入一个FragmentLifecycleCallbacks接口，用来监听内部fragment生命周期事件并派发
 */
public class NLifecycleDispatcher {
}
