package com.example.idicpatente.calendar

import androidx.compose.foundation.layout.Column
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.example.idicpatente.main.BottomNavigationBar
import com.example.idicpatente.main.TopBar
import io.github.boguszpawlowski.composecalendar.SelectableCalendar
import io.github.boguszpawlowski.composecalendar.SelectableWeekCalendar
import io.github.boguszpawlowski.composecalendar.rememberSelectableCalendarState
import io.github.boguszpawlowski.composecalendar.selection.SelectionMode
import java.time.LocalDate
import java.time.YearMonth

@Composable
fun CalendarScreen(
    navController: NavController
){
    Column {
        TopBar(texto = "Calendario")
        SelectableCalendar(
            calendarState = rememberSelectableCalendarState(
                initialMonth = YearMonth.now(),
                initialSelection = listOf(LocalDate.now()),
                initialSelectionMode = SelectionMode.Period,
            )
        )
        BottomNavigationBar(navController = navController)
    }
}

@Preview
@Composable
fun CalendarScreenPreview(){
    CalendarScreen(rememberNavController())
}

