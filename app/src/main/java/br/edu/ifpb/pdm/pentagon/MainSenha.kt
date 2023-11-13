package br.edu.ifpb.pdm.pentagon

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.example.pentagon.SenhaDAO

class MainSenha: AppCompatActivity() {
    private lateinit var dao: SenhaDAO

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        this.dao = SenhaDAO(this)

        this.dao.insert(SenhaBanco("primeira_senha", "senha"))
        Log.i("APP_SENHA", this.dao.select().toString())
    }
}