package com.example.login_dsm.datos

class Invoice {
    fun key(key: String?) {
    }

    var numero: String? = null
    var tipo: String? = null
    var fecha: String? = null
    var cliente: String? = null
    var foto: String? = null
    var concepto: String? = null
    var total: String? = null
    var key: String? = null
    var per: MutableMap<String, Boolean> = HashMap()

    constructor() {}
    constructor(numero: String?, tipo: String?, fecha: String?, cliente: String?, concepto: String?, total: String?, foto: String?) {
        this.numero = numero
        this.tipo = tipo
        this.fecha = fecha
        this.cliente = cliente
        this.concepto = concepto
        this.total = total
        this.foto = foto
    }

    fun toMap(): Map<String, Any?> {
        return mapOf(
            "numero" to numero,
            "tipo" to tipo,
            "fecha" to fecha,
            "cliente" to cliente,
            "concepto" to concepto,
            "total" to total,
            "foto" to foto,
            "key" to key,
            "per" to per
        )
    }
}