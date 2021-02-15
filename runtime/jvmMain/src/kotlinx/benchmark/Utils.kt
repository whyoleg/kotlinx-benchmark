package kotlinx.benchmark

import java.io.*

actual fun Double.format(precision: Int): String {
    return "%,.0${precision}f".format(this) //text.replace(Regex("\\B(?=(\\d{3})+(?!\\d))"), ",")
}

actual fun saveReport(reportFile: String?, results: Collection<ReportBenchmarkResult>) {
    if (reportFile == null)
        return

    File(reportFile).writeText(formatJson(results))
}

actual fun String.readFile(): String {
    return File(this).readText()
}