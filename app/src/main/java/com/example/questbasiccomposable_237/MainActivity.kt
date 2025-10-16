package com.example.questbasiccomposable_237

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            QuestBasicComposableTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    // 🔹 Panggil layout utama
                    TataLetakBoxColumnRow(
                        modifier = Modifier.padding(paddingValues = innerPadding)
                    )
                }
            }
        }
    }
}
