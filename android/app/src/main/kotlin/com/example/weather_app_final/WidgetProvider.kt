package com.example.weather_app_final


import android.appwidget.AppWidgetManager
import android.content.Context
import android.content.SharedPreferences
import android.net.Uri
import android.widget.RemoteViews
import es.antonborri.home_widget.HomeWidgetBackgroundIntent
import es.antonborri.home_widget.HomeWidgetLaunchIntent
import es.antonborri.home_widget.HomeWidgetProvider

class HomeScreenWidgetProvider:HomeWidgetProvider(){
    override fun onUpdate(context: Context, appWidgetManager:AppWidgetManager, appwidgetIds: IntArray, widgetData: SharedPreferences){
        appwidgetIds.forEach{widgetId=> 
        val views=RemoteViews(context.packageName, R.layout.widget_layout).apply{
            val pendingIntent = HomeWidgetLaunchIntent.getActivity(context, MainActivity::class.java)
            setOnClickPendingIntent(R.id.widget_root, pendingIntent)
            
            val counter=widgetData.getInt("_counter",0)
            var counterText="Your counter value is : $counter"
        }
        
        
        }
    }
}