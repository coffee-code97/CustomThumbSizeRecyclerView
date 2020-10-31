package com.example.customthumbsize

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import kotlin.collections.ArrayList

class MainActivity : AppCompatActivity() {
    private lateinit var recyclerView: CustomThumbSizeRecyclerView


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val dataList = ArrayList<Data>()
        dataList.clear()

        recyclerView = findViewById(R.id.recyclerView)
        recyclerView.layoutManager = LinearLayoutManager(this)
        val adapter = RVAdapter(this, dataList)
        recyclerView.adapter = adapter
        //recyclerView.thumbLength = 400
        //recyclerView.thumbLength = (40 * resources.displayMetrics.density).roundToInt() // 40dp

        dataList.add(Data(RVAdapter.VIEW_TYPE_ONE, "1. Hi! I am in View 1"))
        dataList.add(Data(RVAdapter.VIEW_TYPE_TWO, "2. Hi! I am in View 2"))
        dataList.add(Data(RVAdapter.VIEW_TYPE_ONE, "3. Hi! I am in View 3"))
        dataList.add(Data(RVAdapter.VIEW_TYPE_TWO, "4. Hi! I am in View 4"))
        dataList.add(Data(RVAdapter.VIEW_TYPE_ONE, "5. Hi! I am in View 5"))
        dataList.add(Data(RVAdapter.VIEW_TYPE_TWO, "6. Hi! I am in View 6"))
        dataList.add(Data(RVAdapter.VIEW_TYPE_ONE, "7. Hi! I am in View 7"))
        dataList.add(Data(RVAdapter.VIEW_TYPE_TWO, "8. Hi! I am in View 8"))
        dataList.add(Data(RVAdapter.VIEW_TYPE_ONE, "9. Hi! I am in View 9"))
        dataList.add(Data(RVAdapter.VIEW_TYPE_TWO, "10. Hi! I am in View 10"))
        dataList.add(Data(RVAdapter.VIEW_TYPE_ONE, "11. Hi! I am in View 11"))
        dataList.add(Data(RVAdapter.VIEW_TYPE_TWO, "12. Hi! I am in View 12"))
        dataList.add(Data(RVAdapter.VIEW_TYPE_TWO, "13. Hi! I am in View 13"))
        dataList.add(Data(RVAdapter.VIEW_TYPE_TWO, "14. Hi! I am in View 14"))
        dataList.add(Data(RVAdapter.VIEW_TYPE_ONE, "15. Hi! I am in View 15"))
        dataList.add(Data(RVAdapter.VIEW_TYPE_TWO, "16. Hi! I am in View 16"))
        dataList.add(Data(RVAdapter.VIEW_TYPE_ONE, "17. Hi! I am in View 17"))
        dataList.add(Data(RVAdapter.VIEW_TYPE_TWO, "18. Hi! I am in View 18"))
        dataList.add(Data(RVAdapter.VIEW_TYPE_ONE, "19. Hi! I am in View 19"))
        dataList.add(Data(RVAdapter.VIEW_TYPE_TWO, "20. Hi! I am in View 20"))
        dataList.add(Data(RVAdapter.VIEW_TYPE_TWO, "21. Hi! I am in View 21"))
        dataList.add(Data(RVAdapter.VIEW_TYPE_TWO, "23. Hi! I am in View 23"))
        dataList.add(Data(RVAdapter.VIEW_TYPE_TWO, "24. Hi! I am in View 24"))
        dataList.add(Data(RVAdapter.VIEW_TYPE_TWO, "25. Hi! I am in View 25"))
    }
}
