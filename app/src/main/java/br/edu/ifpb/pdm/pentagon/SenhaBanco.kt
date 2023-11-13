package br.edu.ifpb.pdm.pentagon

import java.text.SimpleDateFormat

class SenhaBanco {
    var id: Int
    lateinit var descricao: String
    lateinit var senha_gerada: String
    var created_at: Long
    var updated_at: Long

    // memória
    constructor(nome: String, descricao: String){
        this.id = -1
        this.descricao = descricao
        this.senha_gerada = senha_gerada
        this.created_at = -1
        this.updated_at = -1
    }

    // banco
    constructor(id: Int, descricao: String, senha_gerada: String, created_at: Long, updated_at: Long){
        this.id = id
        this.descricao = descricao
        this.senha_gerada = senha_gerada
        this.created_at = created_at
        this.updated_at = updated_at
    }

    override fun toString(): String {
        val sdf = SimpleDateFormat("dd/MM/yyyy hh:mm:ss")
        return "${id} ${descricao} ${senha_gerada} ${sdf.format(created_at)} ${sdf.format(updated_at)}"
    }
}