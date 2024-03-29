package com.example.idicpatente.tracking.components

import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import co.yml.charts.axis.AxisData
import co.yml.charts.common.model.Point
import co.yml.charts.ui.linechart.LineChart
import co.yml.charts.ui.linechart.model.GridLines
import co.yml.charts.ui.linechart.model.IntersectionPoint
import co.yml.charts.ui.linechart.model.Line
import co.yml.charts.ui.linechart.model.LineChartData
import co.yml.charts.ui.linechart.model.LinePlotData
import co.yml.charts.ui.linechart.model.LineStyle
import co.yml.charts.ui.linechart.model.SelectionHighlightPoint

@Composable
fun HistoricPriceChart(){
    val steps = 5
    val pointsData1: List<Point> =
        listOf(Point(0f, 8f), Point(1f, 18f), Point(2f, 0f), Point(3f, 12f), Point(4f, 2f))

    val pointsData2: List<Point> =
        listOf(Point(0f, 20f), Point(1f, 6f), Point(2f, 2f), Point(3f, 10f), Point(4f, 4f))

    val pointsData3: List<Point> =
        listOf(Point(0f, 10f), Point(1f, 10f), Point(2f, 10f), Point(3f, 4f), Point(4f, 3f))

    val xAxisData = AxisData.Builder()
        .axisStepSize(100.dp)
        .backgroundColor(Color.Transparent)
        .steps(pointsData1.size - 1)
        .labelData { i -> i.toString() }
        .labelAndAxisLinePadding(10.dp)
        .axisLineColor(Color(0xffef6101))
        .axisLabelColor(Color(0xffef6101))
        .build()

    val yAxisData = AxisData.Builder()
        .steps(steps)
        .backgroundColor(Color.Transparent)
        .labelAndAxisLinePadding(5.dp)
        .labelData { i ->
            val yScale = 20 / steps
            (i * yScale).toString()
        }.axisLineColor(Color(0xffef6101))
        .axisLabelColor(Color(0xffef6101))
        .build()
    val lineChartData = LineChartData(
        linePlotData = LinePlotData(
            lines = listOf(
                Line(
                    dataPoints = pointsData1,
                    LineStyle(color = Color.Blue),
                    IntersectionPoint(radius = 2.dp, color = Color.Blue),
                    SelectionHighlightPoint(radius = 1.dp, color = Color.Blue),
                    //ShadowUnderLine(),
                    //SelectionHighlightPopUp()
                ),
                Line(
                    dataPoints = pointsData2,
                    LineStyle(color = Color.Red),
                    IntersectionPoint(radius = 2.dp, color = Color.Red),
                    SelectionHighlightPoint(radius = 1.dp, color = Color.Red),
                    //ShadowUnderLine(),
                    //SelectionHighlightPopUp()
                ),
                Line(
                    dataPoints = pointsData3,
                    LineStyle(color = Color.Green),
                    IntersectionPoint(radius = 2.dp, color = Color.Green),
                    SelectionHighlightPoint(radius = 1.dp, color = Color.Green),
                    //ShadowUnderLine(),
                    //SelectionHighlightPopUp()
                )
            ),
        ),
        xAxisData = xAxisData,
        yAxisData = yAxisData,
        //gridLines = GridLines(),
        backgroundColor = Color.White
    )
    LineChart(
        modifier = Modifier
            .fillMaxWidth()
            .height(250.dp)
            .padding(top = 4.dp),
        lineChartData = lineChartData
    )
}