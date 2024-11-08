import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.TextView
import com.br.ifgoiano.cafeteriaseumadruga.R
import com.br.ifgoiano.cafeteriaseumadruga.data.Servicos

class CafeAdapter(private val context: Context, private val servicos: List<Servicos>) : BaseAdapter() {
    override fun getCount(): Int {
        return servicos.size
    }

    override fun getItem(p0: Int): Any {
        return servicos[p0]
    }

    override fun getItemId(p0: Int): Long {
        return p0.toLong()
    }

    override fun getView(p0: Int, p1: View?, p2: ViewGroup?): View {
        val view = p1 ?: LayoutInflater.from(context).inflate(R.layout.cafe_adapter, p2, false)
        val nomeServico: TextView = view.findViewById(R.id.textServicosOferecidos)
        val servico = servicos[p0]
        nomeServico.text = servico.nomeServico

        return view
    }
}